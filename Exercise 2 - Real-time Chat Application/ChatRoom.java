package rt_chatapp;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ChatRoom {
    private String roomId;
    private Set<User> users = ConcurrentHashMap.newKeySet();

    public ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void broadcastMessage(String message) {
        for (User user : users) {
            user.getWriter().println(message);
        }
    }
}

