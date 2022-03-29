package com.epam.training.student_Arpine_Ordyan.classes.main_task;

import java.util.Arrays;

public class Departament {
    public static void main(String[] args) {
        Abiturient[] abiturient = new Abiturient[3];


        abiturient[0] = new Abiturient("Ordyan", "Arpine", "Yashayi", "sal qar", "091649469",
                new int[]{5, 6, 6});
        abiturient[1] = new Abiturient("Yolyan", "Armen",
                "Yuriki", "Sal qar 5/6",
                "091224838", new int[]{8, 9, 4});
        abiturient[2] = new Abiturient("Asryan", "Anna", "Kareni", "Mashtoc 36",
                "093546987", new int[]{3, 7, 10});
        System.out.println();
        System.out.println("список абитуриентов, имеющих неудовлетворительные оценки;");

        for (int i = 0; i < abiturient.length; i++) {
            for (int j = 0; j < abiturient[i].getRating().length; j++) {
                if (abiturient[i].getRating()[j] <= 3)
                    System.out.println(abiturient[i]);
                break;
            }
        }
        System.out.println("b) список абитуриентов, у которых сумма баллов выше заданной;");

        int givenNum = 18;
        for (int i = 0; i < abiturient.length; i++) {
            int sum = 0;
            for (int j = 0; j < abiturient[i].getRating().length; j++) {
                sum += abiturient[i].getRating()[j];
            }
            if (sum >= givenNum) {
                System.out.println(abiturient[i]);
            }
        }
        System.out.println("c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму).");

        int[] sum = new int[abiturient.length];
        for (int i = 0; i < abiturient.length; i++) {
            sum[i] = 0;
            for (int j = 0; j < abiturient[i].getRating().length; j++) {
                sum[i] += abiturient[i].getRating()[j];


            }
        }
        for (int i = 0; i < abiturient.length; i++) {
            for (int j = i; j < abiturient.length; j++) {
                if (sum[i] < sum[j]) {
                    Abiturient k = abiturient[j];
                    abiturient[j] = abiturient[i];
                    abiturient[i] = k;

                }
            }
            System.out.println(abiturient[i]);
        }

    }
}





