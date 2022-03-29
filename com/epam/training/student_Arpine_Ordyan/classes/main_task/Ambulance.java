package com.epam.training.student_Arpine_Ordyan.classes.main_task;

public class Ambulance {
    public static void main(String[] args) {
        Patient[] patient = new Patient[3];

        patient[0] = new Patient("Ordyan", "Arpine", "Yashayi",
                 "sal qar", "091649469", 456123, "omicron");
        patient[1] = new Patient("Yolyan", "Armen",
                "Yuriki",  "Sal qar 5/6",
                "091224838", 258963, "korona");

        patient[2] = new Patient("Asryan", "Anna", "Kareni",  "Mashtoc 36",
                "093546987", 9632583, "omicron");

        final long  min=147852;
        final long max=963258;
        System.out.println();
        System.out.println("a) список пациентов, имеющих данный диагноз;");
        for (int i = 0; i < patient.length; i++) {
            if(patient[i].getDiagnosis()=="omicron"){
                System.out.println(patient[i]);
            }
        }
        System.out.println();
        System.out.println("b) список пациентов, номер медицинской карты которых находится в заданном интервале.");
        for (int i = 0; i < patient.length; i++) {
            if(patient[i].getMedicalCardnumber()>min && patient[i].getMedicalCardnumber()<max){
                System.out.println(patient[i]);
            }

        }

    }
}
