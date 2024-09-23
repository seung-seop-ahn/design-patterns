package _03_behavioral_patterns._07_observer._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("user1");
        User user2 = new User("user2");

        chatServer.register("sub1", user1);
        chatServer.register("sub2", user2);
        chatServer.register("sub3", user1);

        chatServer.sendMessage(user1, "sub1", "msg1");
        chatServer.sendMessage(user2, "sub2", "msg2");
        chatServer.sendMessage(user1, "sub3", "msg3");
    }
}
