package com.kodewala.oops.inheritance2;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showRole() {
        System.out.println(name + " works at the company.");
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
}


public class EmployeeInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("Simba");

        manager.showRole();      
    }
}