package it.xpug.kata.main;

import it.xpug.kata.birthdaygreetings.BirthdayService;
import it.xpug.kata.birthdaygreetings.EmailService;
import it.xpug.kata.birthdaygreetings.XDate;
import it.xpug.kata.email.RealEmailService;

import java.io.*;
import java.text.ParseException;

import javax.mail.*;
import javax.mail.internet.*;

public class Main {

	public static void main(String[] args) throws IOException, ParseException, MessagingException {
		EmailService emailService = new RealEmailService("localhost", 25);
		BirthdayService service = new BirthdayService(emailService);
		service.sendGreetings("employee_data.txt", new XDate(), "localhost", 25);
	}

}
