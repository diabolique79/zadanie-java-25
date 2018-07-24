package com.example.homework.model;

import java.io.PrintStream;

public class Teacher extends SchoolPerson {

    private String schoolSubject;

    public Teacher(String firstName, String lastName, String schoolSubject) {
        super(firstName, lastName);
        this.schoolSubject = schoolSubject;
    }

    @Override
    public void printInfo() {
        System.out.print("Dane osobowe nauczyciela: ");
        super.printInfo();
        System.out.printf(" Nauczyciel przedmiotu: %s", schoolSubject);
    }
}
