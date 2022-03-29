package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class NumberLengthSort {
    public static void main(String[] args) {
        int n =args.length;
        int i;
        int j;
        int k;
        int[] arr= new int[n];

        for (i = 0; i < args.length; i++){
            arr[i]=args[i].length();
        }
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr[i]> arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        for (i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
