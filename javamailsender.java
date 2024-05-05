/*private String recipient = "yamabs@gmail.com ,priya@gmail.com ";
String[] recipientList = recipient.split(",");
InternetAddress[] recipientAddress = new InternetAddress[recipientList.length];
int counter = 0;
for (String recipient : recipientList) {
    recipientAddress[counter] = new InternetAddress(recipient.trim());
    counter++;
}
message.setRecipients(Message.RecipientType.TO, recipientAddress);*/



public static Properties getMailProperties(boolean addExteraProps) {
    Properties props = new Properties();
    props.put("mail.transport.protocol", MAIL_TRNSPORT_PROTOCOL);
    props.put("mail.smtp.host", MAIL_SERVER_NAME);
    props.put("mail.smtp.port", MAIL_PORT);

    // Sending Email to the GMail SMTP server requires authentication and SSL.
    props.put("mail.smtp.auth", true);
    if(ENCRYPTION_METHOD.equals("STARTTLS")) {
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.socketFactory.port", SMTP_STARTTLS_PORT); // 587
    } else {
        props.put("mail.smtps.ssl.enable", true);
        props.put("mail.smtp.socketFactory.port", SMTP_SSL_PORT); // 465
    }
    props.put("mail.smtp.socketFactory", SOCKETFACTORY_CLASS);
    return props;
}

public static boolean sendMail(String subject, String contentType, String msg, Object recipients) throws Exception {

    Properties props = getMailProperties(false);
    Session mailSession = Session.getInstance(props, null);
    mailSession.setDebug(true);

    Message message = new MimeMessage(mailSession);
    message.setFrom(new InternetAddress(USER_NAME));

    setRecipients(message, recipients);

    message.setSubject(subject);

    String htmlData = "<h1>This is actual message embedded in HTML tags</h1>";
    message.setContent(htmlData, "text/html");

    Transport transport = mailSession.getTransport(MAIL_TRNSPORT_PROTOCOL);
    transport.connect(MAIL_SERVER_NAME, Integer.valueOf(MAIL_PORT), USER_NAME, PASSWORD);
    message.saveChanges(); // Don't forget this

    transport.sendMessage(message, message.getAllRecipients());
    transport.close();
}