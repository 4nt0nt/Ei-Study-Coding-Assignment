package Mediator;

import java.util.ArrayList;
import java.util.List;

interface ChatRoomMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}


class ChatRoom implements ChatRoomMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}


abstract class User {
    protected ChatRoomMediator mediator;
    protected String name;

    public User(ChatRoomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

class ChatUser extends User {
    public ChatUser(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sends: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " receives: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Anton");
        User user2 = new ChatUser(chatRoom, "Dan");
        User user3 = new ChatUser(chatRoom, "Pondy");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
    }
}
