package rt_chatapp;

import java.io.*;
import java.net.*;
import java.util.List;

public class ClientHandler implements Runnable {
    private Socket socket;
    private User user;
    private BufferedReader reader;
    private PrintWriter writer;
    private ChatRoomManager chatRoomManager;
    private ChatRoom currentChatRoom;

    public ClientHandler(Socket socket, ChatRoomManager chatRoomManager) throws IOException {
        this.socket = socket;
        this.chatRoomManager = chatRoomManager;
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.writer = new PrintWriter(socket.getOutputStream(), true);
    }

    @Override
    public void run() {
        try {
            writer.println("Enter your username: ");
            String username = reader.readLine();
            this.user = new User(username, writer);
            chatRoomManager.addActiveUser(user);

            writer.println("Enter chat room ID to join or create: ");
            String roomId = reader.readLine();
            currentChatRoom = chatRoomManager.getChatRoom(roomId);
            currentChatRoom.addUser(user);

            currentChatRoom.broadcastMessage(user.getUsername() + " has joined the chat!");

            String message;
            while ((message = reader.readLine()) != null) {
                if (message.equalsIgnoreCase("#actusers")) {
                    List<String> activeUsers = chatRoomManager.getActiveUsers();
                    writer.println("Active users: " + activeUsers);
                } else if (message.startsWith("#private ")) {
                    handlePrivateMessage(message);
                } else {
                    currentChatRoom.broadcastMessage(user.getUsername() + ": " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (currentChatRoom != null) {
                currentChatRoom.removeUser(user);
                currentChatRoom.broadcastMessage(user.getUsername() + " has left the chat.");
            }
            chatRoomManager.removeActiveUser(user);
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handlePrivateMessage(String message) {
        try {
            String[] parts = message.split(" ", 3);
            if (parts.length < 3) {
                writer.println("Invalid private message format. Use: #private [username] [message]");
                return;
            }
            String targetUsername = parts[1];
            String privateMessage = parts[2];

            User targetUser = chatRoomManager.getUserByUsername(targetUsername);
            if (targetUser != null) {
                targetUser.getWriter().println("Private message from " + user.getUsername() + ": " + privateMessage);
                writer.println("Private message sent to " + targetUsername);
            } else {
                writer.println("User " + targetUsername + " is not online.");
            }
        } catch (Exception e) {
            writer.println("Error handling private message: " + e.getMessage());
        }
    }
}

