package com.goconsult.service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSendHelper {

    public static int sendEmail(String recipient,String subject,String message)  {
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "goconsult77@gmail.com";

        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");
        try{
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication("goconsult77@gmail.com","rogrlkwvexlcfkrt");
                }
            });

            MimeMessage mimeMessage = new MimeMessage(session);

            mimeMessage.setFrom(from);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            Transport.send(mimeMessage);

            System.out.println("Message sent successfully");
            return 1;
        }catch (Exception e){
            return 0;
        }

    }

}


