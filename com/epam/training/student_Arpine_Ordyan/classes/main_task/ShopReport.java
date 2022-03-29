package com.epam.training.student_Arpine_Ordyan.classes.main_task;

import java.util.Arrays;

// Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
public class ShopReport {
    public static void main(String[] args) {
        Customer[] castomer = new Customer[3];
        castomer[0] = new Customer("Gohar", "Ordyan", "Yashayi", "Sal qar",
                123456, "78-94-56");
        castomer[1] = new Customer("Armine", "Karapetyan", "Mishayi", "Avangard",
                12349, "85-21-47");
        castomer[2] = new Customer("Lusine", "Anna", "Kareni", "Mashtoc 36",
                12346, "36-98-74");

        System.out.println();
        System.out.println("список покупателей в алфавитном порядке");

        Arrays.sort(castomer, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(Arrays.asList(castomer));


        System.out.println("список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
        int min = 123450;
        int max = 200000;
        for (int i = 0; i < castomer.length; i++) {
            if (castomer[i].getCeditCardNumber() > min && castomer[i].getCeditCardNumber() < max) {
                System.out.println(castomer[i]);
            }
        }
    }
}




