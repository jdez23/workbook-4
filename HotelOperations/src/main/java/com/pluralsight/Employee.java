package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private int payRate;
    private int hoursWorked;

    public Employee (){};

    public Employee(int employeeId, String name, String department, int payRate, int hoursWorked) {
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

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getTotalPay() {
        return payRate * hoursWorked;
    };

    public int getRegularHours(){
        int overTime = hoursWorked - 40;
        return hoursWorked - overTime;
    };

    public int getOvertimeHours() {
      return hoursWorked - 40;
    };

}
