package com.epam.training.student_Arpine_Ordyan.classes.main_task;

import java.sql.Array;

import java.util.Arrays;

public class StudentList {
    //1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    public static void main(String[] args) {

        Student[] student = new Student[3];

        student[0] = new Student("Ordyan", "Arpine", "Yashayi",
                "1974-05-10", "sal qar", "091649469", "kirarakan",
                2, "k-120");
        student[1] = new Student("Yolyan", "Armen",
                "Yuriki", "1973-03-16", "Sal qar 5/6",
                "091224838", "meqenashinakan", 3, "m-154");

        student[2] = new Student("Asryan", "Anna", "Kareni", "1990-02-09", "Mashtoc 36",
                "093546987", "kirarakan", 3, "k-220");
        System.out.println();

        System.out.println();
        System.out.println("списки студентов для каждого факультета и курса");


        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "  course");
            for (Student j : student) {
                if (j.getCourse() == i + 1)
                    System.out.println(j);
            }
        }

        String[] faculty = new String[student.length];
        int k = 0;
        faculty[k] = student[0].getFaculty();
        k++;
        for (Student j : student) {
            boolean f1 = true;
            for (String s : faculty) {
                if (j.getFaculty().equals(s)) {
                    f1 = false;
                    break;
                }
            }
            if (f1) {
                faculty[k] = j.getFaculty();
                k++;
            }
        }
        if (k < student.length) {
            String[] mass = new String[k];
            for (int i = k; i < faculty.length; i++) {
                faculty[i] = "";
            }
            System.arraycopy(faculty, 0, mass, 0, k);
            faculty = mass;
        }
        //  Array.sort(faculty);
        for (String s : faculty) {
            System.out.println("Faculty  " + s);
            for (Student j : student) {
                if (j.getFaculty().equals(s)) {
                    System.out.println(j);
                }
            }
        }
        System.out.println();
        int year = 1974;
        System.out.println("список студентов, родившихся после заданного года");
        for (int i = 0; i < student.length; i++) {
            if (student[i].getYear() >= year) {
                System.out.println(student[i]);
            }
        }
        System.out.println();
        System.out.println(" список учебной группы.");
        String group = "k-120";
        for (int i = 0; i < student.length; i++) {
            if (student[i].getGroup().equals(group))
                System.out.println(student[i]);
        }
    }
}




