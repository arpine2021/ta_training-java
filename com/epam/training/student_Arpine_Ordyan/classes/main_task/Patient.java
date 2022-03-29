package com.epam.training.student_Arpine_Ordyan.classes.main_task;

public class Patient {
    private static int patientId;
    private int id = 1;
    private String lastName;
    private String name;
    private String middlename;
    private String address;
    private String telNumber;
    private long medicalCardnumber;
    private String diagnosis;

    Patient(String lastName, String name, String middlename, String address, String telNumber, long medicalCardnumber, String diagnosis) {
        this.id = ++patientId;
        this.lastName = lastName;
        this.name = name;
        this.middlename = middlename;
        this.address = address;
        this.telNumber = telNumber;
        this.medicalCardnumber = medicalCardnumber;
        this.diagnosis = diagnosis;

    }

    public int getId() {

        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public long getMedicalCardnumber() {
        return medicalCardnumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", medicalCardnumber=" + medicalCardnumber + '\'';

    }
}
