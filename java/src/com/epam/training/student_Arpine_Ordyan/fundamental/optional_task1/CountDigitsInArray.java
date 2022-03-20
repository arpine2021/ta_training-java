package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;

public class CountDigitsInArray {
    public static void main(String[] args) {
        int n = args.length;
        int[] numbers = new int[n];
        int i;
        int count = 0;
        int countofequls=0;
        for (i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            System.out.println(numbers[i]);
        }
        for (int number : numbers) {
            boolean t = true;
            int countofevens=0;
            int countofodds=0;
            while (number != 0) {
                int currentDigit = number % 10;
                number = number / 10;
                if (currentDigit % 2 == 0) {
                    t = false;
                    countofevens++;
                }
                else countofodds++;
            }
            if (t == true) count++;
            else if (countofevens==countofodds)
               countofequls++;
        }
        System.out.println(count);
        System.out.println(countofequls);
    }
}

