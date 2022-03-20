package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class DifferentDigit {
    public static void main(String[] args) {
        int n = args.length;
        int currentdigit;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(args[i]);
        for (int number : numbers) {
            boolean t = true;
            int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int copynumber = number;
            while (copynumber != 0) {

                currentdigit = copynumber % 10;
                copynumber = copynumber / 10;
                counts[currentdigit]++;
            }
            for (int i = 0; i < counts.length; i++)
                if (counts[i] <= 1)
                    t = true;
                else {
                    t = false;
                    break;
                }
            if (t == true) {
                System.out.println(number);
                break;
            }

        }

    }
}




