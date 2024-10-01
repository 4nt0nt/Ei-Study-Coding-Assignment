package rt_chatapp;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ChatRoomManager {
    private Map<String, ChatRoom> chatRooms = new ConcurrentHashMap<>();
    private Set<User> activeUsers = new TreeSet<>(Comparator.comparing(User::getUsername));

    private static ChatRoomManager instance = new ChatRoomManager();

    private ChatRoomManager() {
    }

    public static ChatRoomManager getInstance() {
        return instance;
    }

    public ChatRoom getChatRoom(String roomId) {
        return chatRooms.computeIfAbsent(roomId, ChatRoom::new);
    }

    public void addActiveUser(User user) {
        activeUsers.add(user);
    }

    public void removeActiveUser(User user) {
        activeUsers.remove(user);
    }

    public List<String> getActiveUsers() {
        List<String> usernames = new ArrayList<>();
        for (User user : activeUsers) {
            usernames.add(user.getUsername());
        }
        Collections.sort(usernames);
        return usernames;
    }

    public User getUserByUsername(String username) {
        for (User user : activeUsers) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }
}


