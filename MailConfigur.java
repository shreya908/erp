package MailDemo;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailConfigur extends Authenticator
{
 public PasswordAuthentication   getPasswordAuthentication()
 {
	 PasswordAuthentication p =new PasswordAuthentication("Sharmashreya205@gmail.com","860nicenikkinice828");
	 return p;
 }
}
