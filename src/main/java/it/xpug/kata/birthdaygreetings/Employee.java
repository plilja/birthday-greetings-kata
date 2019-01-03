package it.xpug.kata.birthdaygreetings;

import java.time.LocalDate;

public class Employee {

    private LocalDate birthDate;
    private String lastName;
    private String firstName;
    private String email;

    public Employee(String firstName, String lastName, String birthDate, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birthDate);
        this.email = email;
    }

    public boolean isBirthday(LocalDate day) {
        return day.getMonth() == birthDate.getMonth() && day.getDayOfMonth() == birthDate.getDayOfMonth();
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Employee " + firstName + " " + lastName + " <" + email + "> born " + birthDate;
    }

}
