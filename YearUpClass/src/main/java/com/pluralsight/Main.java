package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Jesse");
        System.out.println(student.getId() + " " + student.getFirstName());

    }
}