package it.xpug.kata.main;

import it.xpug.kata.birthdaygreetings.BirthdayService;
import it.xpug.kata.birthdaygreetings.EmailService;
import it.xpug.kata.birthdaygreetings.EmployeeService;
import it.xpug.kata.birthdaygreetings.XDate;
import it.xpug.kata.email.RealEmailService;
import it.xpug.kata.persistence.FileEmployeeService;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new RealEmailService("localhost", 25);
        EmployeeService employeeService = new FileEmployeeService("employee_data.txt");
        BirthdayService service = new BirthdayService(emailService, employeeService);
        service.sendGreetings(new XDate());
    }

}
