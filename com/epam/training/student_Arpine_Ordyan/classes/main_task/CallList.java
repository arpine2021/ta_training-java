package com.epam.training.student_Arpine_Ordyan.classes.main_task;
import java.util.Arrays;
public class CallList {
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone("Ordyan", "Arpine", "Yashayi", "sal qar", 91649469,
                4569.74, 7896.52, 123, 154);
        phone[1] = new Phone("Yolyan", "Armen", "Yuriki", "Sal qar 5/6", 91224838, 1478.25, 789.125, 78, 963);
        phone[2] = new Phone("Asryan", "Anna", "Kareni", "Mashtoc 36", 93546987, 5897.25,
                6547.3, 65, 87);

        System.out.println("a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;");
        int urbanCallTyme = 70;
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].getTimeOfUrbanCall() > urbanCallTyme) {
                System.out.println(phone[i]);
            }
        }
        System.out.println("b) сведения об абонентах, которые пользовались междугородной связью;");

        int interCityCallTyme = 80;
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].getTimeOfIntercityCall()>interCityCallTyme){
                System.out.println(phone[i]);
            }
        }

        System.out.println("c) сведения об абонентах в алфавитном порядке");
        Arrays.sort(phone, (a, b) -> a.getLastName().compareTo(b.getLastName()));
        System.out.println(Arrays.asList(phone));


    }
}
