package org.example.javahw.Homework5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Employee: full name=%s, position=%s, email=%s, number=%s, salary=%d, age=%d", fullName, position, email, number, salary, age);
    }

    public int getAge() {
        return this.age;
    }
}
