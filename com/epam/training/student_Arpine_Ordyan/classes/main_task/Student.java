package com.epam.training.student_Arpine_Ordyan.classes.main_task;

import java.time.LocalDate;

public class Student {
    private static int id=0;
    private int studentId;
    private String lastName;
    private String name;
    private String middleName;
    private LocalDate date = LocalDate.parse("1990-02-05");
    private String adress;
    private String telNumber;
    private String faculty;
    private int course;
    private String group;


    public Student(String lastName, String name, String middleName, String date,
                   String adress, String telNumber, String faculty, int courseNumber,
                   String group) {
        this.studentId = id++;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.date = LocalDate.parse(date);
        this.adress = adress;
        this.telNumber = telNumber;
        this.faculty = faculty;
        this.course = courseNumber;
        this.group = group;
    }

//        public void setId(int id) {
//            this.id = id;
//
//        }

    public int getId() {

        return studentId;
    }

    public void printId() {

        System.out.println(studentId);
    }

    public String getLastName() {

        return lastName;
    }
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

   public String getGroup() { return group;   }


    public int getYear(){
        return getDate().getYear();
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "studentId=" + studentId +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", date=" + date +
                ", adress='" + adress + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}




