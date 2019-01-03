package it.xpug.kata.persistence;

import it.xpug.kata.birthdaygreetings.Employee;
import it.xpug.kata.birthdaygreetings.EmployeeService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileEmployeeService implements EmployeeService {
    private final String fileName;

    public FileEmployeeService(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Employee> getEmployees() throws EmployeeServiceException {
        List<Employee> result = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String str;
            in.readLine(); // skip header
            while ((str = in.readLine()) != null) {
                String[] employeeData = str.split(", ");
                Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
                result.add(employee);
            }
            return result;
        } catch (IOException ex) {
            throw new EmployeeServiceException("Error caught while reading employees from file", ex);
        }
    }
}
