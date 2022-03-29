package com.epam.training.student_Arpine_Ordyan.classes.main_task;

public class Librari {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("Heqiatner", "Tumanyan", "Hajpethrat", 1980, 200, 4050, "qartajin");
        book[1] = new Book("Banastexcutyunner", "Charenc", "Hajpethrat", 1988, 300, 3550, "qartajin");
        book[2] = new Book("Java", "Shildt", "Vector", 2010, 800, 5550, "arcern");
        book[3] = new Book("Chari verjy", "Tumanyan", "Erevanhrat", 2020, 568, 4500, "online");
        System.out.println("a) список книг заданного автора;");
        for (int i = 0; i < book.length; i++) {
            if (book[i].getAuthor() == "Tumanyan") {
                System.out.println(book[i]);
            }
        }
        System.out.println("b)   список книг, выпущенных заданным издательством;");
        for (int i = 0; i < book.length; i++) {
            if (book[i].getPublisher() == "Hajpethrat") {
                System.out.println(book[i]);
            }
        }
        System.out.println("c)   список книг, выпущенных после заданного года.");

        for (int i = 0; i < book.length; i++) {
            if (book[i].getPublicationYear() > 1988) {
                System.out.println(book[i]);
            }
        }
    }
}
