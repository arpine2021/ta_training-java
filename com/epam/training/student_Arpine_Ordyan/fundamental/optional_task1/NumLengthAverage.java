package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class NumLengthAverage {
    public static void main(String[] args) {
        int i;
        double sum = 0;

        for (i = 0; i < args.length; i++) {
            sum += args[i].length();
        }
        double average =  (sum / args.length);
        System.out.println(average);
        for (i = 0; i < args.length; i++) {
            if (args[i].length() > average) {
                System.out.println(args[i] + " " + args[i].length());
            }
        }
    }
}
