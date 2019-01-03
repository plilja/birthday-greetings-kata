package it.xpug.kata.birthdaygreetings;

import java.time.LocalDate;

public class BirthdayService {

    private final EmailService emailService;
    private final EmployeeService employeeService;

    public BirthdayService(EmailService emailService, EmployeeService employeeService) {
        this.emailService = emailService;
        this.employeeService = employeeService;
    }

    public void sendGreetings(LocalDate date) {
        for (Employee employee : employeeService.getEmployees()) {
            if (employee.isBirthday(date)) {
                String recipient = employee.getEmail();
                String body = String.format("Happy Birthday, dear %s!", employee.getFirstName());
                String subject = "Happy Birthday!";
                emailService.sendEmail("sender@here.com", subject, body, recipient);
            }
        }
    }

}
