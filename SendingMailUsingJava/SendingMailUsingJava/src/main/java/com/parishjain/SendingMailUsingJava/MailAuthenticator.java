package com.parishjain.SendingMailUsingJava;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(MailConstants.SENDER,"hsjmswwlfchrobzt");
    }
}
