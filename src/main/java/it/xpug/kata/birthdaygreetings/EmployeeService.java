package it.xpug.kata.birthdaygreetings;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees() throws EmployeeServiceException;

    class EmployeeServiceException extends RuntimeException {
        public EmployeeServiceException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }
}
