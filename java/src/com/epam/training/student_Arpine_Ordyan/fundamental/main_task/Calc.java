package com.epam.training.student_Arpine_Ordyan.fundamental.main_task;

public class Calc {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        double product = 1;

        for (i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            product *= Integer.parseInt(args[i]);
        }

        System.out.println("sum=" + sum);
        System.out.println("product=" + product);
    }
}
