package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double endTime;

    public Employee (){};

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    };

    public double getRegularHours(){
        double overTime = hoursWorked - 40;
        return hoursWorked - overTime;
    };

    public double getOvertimeHours() {
      return hoursWorked - 40;
    };

    public void punchIn(LocalTime time){
        this.startTime = Double.parseDouble(String.valueOf(time));
    }

    public LocalTime punchIn(){
        return LocalTime.parse(String.valueOf(startTime));
    }
    public void punchOut(double time){
        endTime = time;
    }

    public LocalTime punchOut(){
        return LocalTime.parse(String.valueOf(endTime));
    }

}
