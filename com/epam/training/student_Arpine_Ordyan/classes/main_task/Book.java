package com.epam.training.student_Arpine_Ordyan.classes.main_task;

//5. Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
public class Book {
    private static int idBook = 1;
    private int id;
    public String Title;
    private String Author;
    private String Publisher;
    private int publicationYear;
    private int NumberOfPages;
    private float price;
    private String TypeOfBinding;

    public Book(String title, String author, String publisher, int publicationYear, int numberOfPages, float price, String typeOfBinding) {
        this.id = idBook++;
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;
        this.publicationYear = publicationYear;
        this.NumberOfPages = numberOfPages;
        this.price = price;
        this.TypeOfBinding = typeOfBinding;
    }

    public static int getIdBook() {
        return idBook;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public String getTypeOfBinding() {
        return TypeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", NumberOfPages=" + NumberOfPages +
                ", price=" + price +
                ", TypeOfBinding='" + TypeOfBinding + '\'' +
                '}';
    }
}
