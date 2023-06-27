# JavaMailAPI
This project provides a simple implementation of sending emails using Java. It demonstrates how to send an email with attachments using the javax.mail library.

# Prerequisites
  * Java Development Kit (JDK) installed
  * javax.mail library added to the classpath

# Usage
  Clone the repository or download the source code.
  Import the project into your Java IDE.
  Modify the following constants in the MailConstants class according to your requirements:
  * SENDER: The email address of the sender.
  * RECEIVER: The email address of the recipient.
  * SUBJECT: The subject of the email.
  * MESSAGE: The content of the email.
  In the MailAuthenticator class, replace the second parameter of the PasswordAuthentication constructor with the password for the sender's email account.
  Run the SendingMailUsingJavaApplication class.
  Check the console output to verify if the email was sent successfully.

## Note: 
The code provided assumes that the email service provider is Gmail. If you are using a different provider, you may need to modify the SMTP host and port in the HandleMail class.

# Code Explanation
 * HandleMail: This class handles the email sending process. It sets up the required properties, creates a session, constructs the email message, and sends it.
  
 * MailAuthenticator: This class extends Authenticator and provides the sender's email address and password for authentication.
  
 * MailConstants: This class contains constant values such as the sender and receiver email addresses, subject, and message content.

 * SendingMailUsingJavaApplication: This class serves as the entry point of the application. It creates an instance of HandleMail and invokes the sendManager() 
  method to send the email.



## Feel free to contribute, open issues, or provide suggestions to improve this project.
