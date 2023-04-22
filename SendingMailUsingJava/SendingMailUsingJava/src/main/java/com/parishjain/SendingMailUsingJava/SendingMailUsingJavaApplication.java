package com.parishjain.SendingMailUsingJava;

public class SendingMailUsingJavaApplication {

	public static void main(String[] args) {

		// Prepare to send the mail
		System.out.println("This Application is supposed to be sent mail");

		HandleMail mailer = new HandleMail();
		mailer.sendManager();
	}

}
