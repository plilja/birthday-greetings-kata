package it.xpug.kata.birthdaygreetings;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class EmployeeTest {

	@Test
	public void testBirthday() {
		Employee employee = new Employee("foo", "bar", "1990-01-31", "a@b.c");
		assertFalse("not his birthday", employee.isBirthday(LocalDate.parse("2008-01-30")));
		assertTrue("his birthday", employee.isBirthday(LocalDate.parse("2008-01-31")));
	}

}
