package _02_structural_patterns._05_facade._02_after;

public class Client {

    public static void main(String[] args) {

        EmailSettings settings = new EmailSettings();
        settings.setHost("127.0.0.1");

        EmailMessage message = new EmailMessage();
        message.setFrom("user1@example");
        message.setTo("user2@example");
        message.setSubject("Test Mail");
        message.setText("message");

        EmailSender sender = new EmailSender(settings);
        sender.sendEmail(message);
    }
}
