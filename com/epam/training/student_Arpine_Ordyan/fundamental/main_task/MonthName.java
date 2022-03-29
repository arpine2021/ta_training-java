package com.epam.training.student_Arpine_Ordyan.fundamental.main_task;

public class MonthName {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i;
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"};

                System.out.println(months[n - 1]);
    }
}