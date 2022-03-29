package com.epam.training.student_Arpine_Ordyan.classes.main_task;

import java.util.Arrays;

//4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
public class Abiturient {
    private static int abiturientId = 1;
    private int id;
    private String name;
    private String lastName;
    private String middleName;
    private String address;
    private String telNumber;
    private int[] rating;

    Abiturient(String name, String lastName, String middleName, String address, String telNumber,
               int[] rating
    ) {
        this.id = abiturientId++;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.telNumber = telNumber;
        this.rating = rating;

    }

    public static int getAbiturientId() {
        return abiturientId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public int[] getRating() {
        return rating;
    }

    public double ArraySum(double[] a) {
        double sum = 0;
        int Element;
        for (Element = 0; Element < a.length; Element++) {
            sum = sum + a[Element];
        }
        return sum;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", middleName='" + middleName + '\'' +
                        ", address='" + address + '\'' +
                        ", telNumber='" + telNumber + '\'' +
                        ", rating=" + Arrays.toString(rating) + '\'';
    }

}
