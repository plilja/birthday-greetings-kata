package it.xpug.kata.birthdaygreetings;

public class BirthdayService {

    private final EmailService emailService;
    private final EmployeeService employeeService;

    public BirthdayService(EmailService emailService, EmployeeService employeeService) {
        this.emailService = emailService;
        this.employeeService = employeeService;
    }

    public void sendGreetings(XDate xDate) {
        for (Employee employee : employeeService.getEmployees()) {
            if (employee.isBirthday(xDate)) {
                String recipient = employee.getEmail();
                String body = "Happy Birthday, dear %NAME%!".replace("%NAME%", employee.getFirstName());
                String subject = "Happy Birthday!";
                emailService.sendEmail("sender@here.com", subject, body, recipient);
            }
        }
    }

}
