package com.chainsys.jobportal.dao;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * Mail functionality to user
 * @author kart2114
 *
 */
public class UserSendMail {
	public static void sendHtmlMail(String subject, String content, String mail) {
		try {
			Email email = new HtmlEmail();
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("chainsys97@gmail.com", "googlechrome"));
			email.setDebug(false);
			email.setHostName("smtp.gmail.com");
			email.setFrom("chainsys97@gmail.com");
			email.setSubject(subject);
			email.setMsg(content);
			email.addTo(mail);
			email.setTLS(true);
			email.send();
		} 
		catch (EmailException e) {
			e.printStackTrace();
		}
	}

	public static void sendHtmlMail1(String subject1, String content1, String mail1) {
		try {
			Email email = new HtmlEmail();
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("chainsys97@gmail.com", "googlechrome"));
			email.setDebug(false);
			email.setHostName("smtp.gmail.com");
			email.setFrom("chainsys97@gmail.com");
			email.setSubject(subject1);
			email.setMsg(content1);
			email.addTo(mail1);
			email.setTLS(true);
			email.send();
			System.out.println("mail sent!");
		}
		catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
