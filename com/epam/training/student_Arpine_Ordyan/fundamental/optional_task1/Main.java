package com.epam.training.student_Arpine_Ordyan.fundamental.optional_task1;


    public class Main {

        public static void main(String[] args) {
            int[] numbers = {12343240, 11112222, 12412, 121111, 2222331};

            int minimalNumber = numbers[0];
            int minimumNotRepeatedDigitsCount = 10;

            for (int number : numbers) {
                int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

                // Calculate each digit count in number and store in counts array
                int copyOfNumber = number;
                while (copyOfNumber != 0) {
                    int currentDigit = copyOfNumber % 10;
                    copyOfNumber = copyOfNumber / 10;
                    counts[currentDigit]++;
                }

                // Calculate different digits count
                int numberOfNotRepeatedDigits = 0;
                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] >= 1) {
                        numberOfNotRepeatedDigits++;
                    }
                }

                // Find minimum different digits count
                if (numberOfNotRepeatedDigits < minimumNotRepeatedDigitsCount) {
                    minimumNotRepeatedDigitsCount = numberOfNotRepeatedDigits;
                    minimalNumber = number;
                }
            }

            System.out.println("For number " + minimalNumber + " different digits count is " + minimumNotRepeatedDigitsCount);
        }
    }

