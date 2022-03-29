package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class CountDifferentDigit {
    public static void main(String[] args) {
        int n = args.length;
        int[] numbers = new int[n];
        int i;
        int mindiff = 10;
        int minnumber= numbers[0];
        for (i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int copynumber=number;
            while (copynumber != 0) {
                int index = copynumber % 10;
                copynumber = copynumber / 10;
                counts[index]++;
            }

            int alldiffs = 0;
            for (i = 0; i < counts.length; i++) {
                if (counts[i] >= 1)
                    alldiffs++;
            }
            if (alldiffs < mindiff) {
                mindiff = alldiffs;
                minnumber=number;
                //System.out.println(minnumber);
            }
        }
        System.out.println(minnumber +"  "+ mindiff);
    }
}





