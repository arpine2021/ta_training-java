package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class AscendingOrder {
    public static void main(String[] args) {
        int n = args.length;
        int[] numbers = new int[n];
        int i;

        int prev;
        int next;
        for (i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(args[i]);
        for (int number : numbers) {
            int ascnumber=number;
            boolean t = true;
            while (ascnumber != 0) {
                prev = ascnumber % 10;
                ascnumber = ascnumber / 10;
                next = ascnumber % 10;
                if (next >= prev) {
                    t = false;
                    break;
                }
            }
            if (t == true){
                System.out.println(number);
            break;}

        }
    }
}
