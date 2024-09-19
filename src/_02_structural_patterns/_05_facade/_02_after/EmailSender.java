package _02_structural_patterns._05_facade._02_after;

public class EmailSender {

    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage emailMessage) {
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", emailSettings.getHost());
//
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(emailMessage.getFrom()));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailMessage.getTo()));
//            message.setSubject(emailMessage.getSubject());
//            message.setText(emailMessage.getText());
//
//            Transport.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
    }
}
