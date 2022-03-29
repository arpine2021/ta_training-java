package com.epam.training.student_Arpine_Ordyan.fundamental.main_task;

public class RandomNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i;
        int min = 50;
        int max = 100;
        for (i = 0; i < n; i++) {
            int random_int = (int) Math.floor(Math.random() * (max + min - 1) + min);
            System.out.println(random_int);
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            int random_int = (int) Math.floor(Math.random() * (max + min - 1) + min);
            System.out.print(random_int + " ");
        }
    }
}
