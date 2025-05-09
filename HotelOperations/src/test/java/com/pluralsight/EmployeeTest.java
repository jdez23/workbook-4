package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_thenPunchOut_shouldAccumulateWorkedHours() {
        // Arrange
        Employee emp = new Employee("Jesse", 1);
        // at start: not clocked in, 0 hours
        assertFalse(emp.isClockedIn());
        assertEquals(0.0, emp.getHoursWorked());

        // Act
        emp.punchIn(9.0);      // 9:00 am
        assertTrue(emp.isClockedIn(), "Employee should be clocked in after punchIn");

        emp.punchOut(17.5);    // 5:30 pm
        // worked = 17.5 − 9.0 = 8.5 hours

        // Assert
        assertFalse(emp.isClockedIn(), "Employee should be clocked out after punchOut");
        assertEquals(8.5, emp.getHoursWorked(), 0.0001,
                "Worked hours should equal punchOut time minus punchIn time");
    }

    @Test
    public void multiplePunchInOutSessions_shouldAccumulateAcrossSessions() {
        // Arrange
        Employee emp = new Employee("Bob", 2);

        // First session
        emp.punchIn(8.0);
        emp.punchOut(12.0);
        // +4.0 hours

        // Second session
        emp.punchIn(13.0);
        emp.punchOut(17.0);
        // +4.0 hours

        // Assert total
        assertEquals(8.0, emp.getHoursWorked(), 0.0001,
                "Total worked hours should be sum of both sessions");
    }

    @Test
    public void punchOutWithoutPunchIn_shouldNotChangeHours() {
        // Arrange
        Employee emp = new Employee("Carol", 3);

        // Act: punchOut without punching in
        emp.punchOut(10.0);

        // Assert
        assertFalse(emp.isClockedIn(), "Still should not be clocked in");
        assertEquals(0.0, emp.getHoursWorked(), 0.0001,
                "No hours should be recorded if never punched in");
    }
}