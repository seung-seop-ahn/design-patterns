package _03_behavioral_patterns._07_observer._01_before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("sub1", "msg1");
        user1.sendMessage("sub2", "msg2");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("sub1"));

        user1.sendMessage("sub1", "new_msg");
        System.out.println(user2.getMessage("sub1"));
    }
}
