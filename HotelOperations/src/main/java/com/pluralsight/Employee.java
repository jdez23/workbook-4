package com.pluralsight;

public class Employee {
    private String employeeName;
    private int id;
    private boolean isClockedIn;
    private double hoursWorked;

    public Employee(String employeeName, int id) {
        this.employeeName = employeeName;
        this.id = id;
        this.isClockedIn = false;
        this.hoursWorked = 0.0;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getId() {
        return id;
    }

    public boolean isClockedIn() {
        return isClockedIn;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void punchIn(double hours) {
        isClockedIn = true;
    }

    public void punchOut(double hours) {
        isClockedIn = false;
        hoursWorked += hours;
    }
}
