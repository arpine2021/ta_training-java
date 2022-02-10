package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class MinMaxLength {
    public static void main(String[] args) {
        int n = args.length;
        int i;
        int k=0;
        int l = 0;
        int max;
        int min;
        max = args[0].length();

        for (i = 1; i < n; i++) {
            if (args[i].length() > max){
                max = args[i].length();
                k=i;}
        }
        min = args[0].length();

        for (i = 1; i < n; i++) {
            if (args[i].length() < min){
                min = args[i].length();
                l=i;}
        }
        System.out.println(args[l]+" "+min);
        System.out.println(args[k]+" "+max);

    }
}


