package com.example.homework.model;

public class Student extends SchoolPerson{

    private int age;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.print("Dane osobowe studenta: ");
        super.printInfo();
        System.out.println(" Wiek: " + age);
    }
}
