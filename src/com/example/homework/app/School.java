package com.example.homework.app;

import com.example.homework.model.Student;
import com.example.homework.model.Teacher;

public class School {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Anna","Wasilewska", "geografia");
        Student student = new Student("Karol", "Kwaśnik", 24);

        teacher.printInfo();
        System.out.println("");
        student.printInfo();
    }
}
