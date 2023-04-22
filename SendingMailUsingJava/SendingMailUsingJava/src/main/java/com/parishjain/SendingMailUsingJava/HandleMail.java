package com.parishjain.SendingMailUsingJava;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

// This class is to handle all the attachments
public class HandleMail {

    void sendManager(){

        // We know that for sending mail we need  host
        // host : gmail is smtp:
        String host = "smtp.gmail.com";
        Properties props = System.getProperties();
        System.out.println("Properties : "+props);

        // Setting Properties
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable",true);
        props.put("mail.smtp.auth",true);

        // Session
        // Basically session is an active time of user
        // We have to create the session
        // Session Constructor is private that's why we cannot make its object with new
        // so we have method that will give us instance of that class.
        Session mailSession =  Session.getInstance(props,new MailAuthenticator());

        // Create the message object
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        try {

            // sender
            mimeMessage.setFrom(MailConstants.SENDER);

            // receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVER));

            // Message
            mimeMessage.setText(MailConstants.MESSAGE);

            // Subject
            mimeMessage.setSubject(MailConstants.SUBJECT);


            Transport.send(mimeMessage);

        } catch (MessagingException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }


    }
}
