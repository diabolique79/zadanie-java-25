package com.example.homework.model;

public class SchoolPerson {

    private String firstName;
    private String lastName;

    public SchoolPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {

        System.out.printf("Imię: %s, nazwisko: %s", firstName, lastName);
    }
}
