package by.step.teach_java.class_work.cw_29082022_classes;

import java.time.LocalDate;
import java.util.Scanner;

public class Book {
    private String nameOfBook;
    private String fioAuthor;
    private LocalDate yearPublishing;
    private String genreBook;
    private int countOfPage;

    private Scanner scan = new Scanner(System.in);

    public Book(String nameOfBook, String fioAuthor) {
        this.nameOfBook = nameOfBook;
        this.fioAuthor = fioAuthor;
    }

    public Book(LocalDate yearPublishing, String genreBook, int countOfPage) {
        this.yearPublishing = yearPublishing;
        this.genreBook = genreBook;
        this.countOfPage = countOfPage;
    }

    public Book(String nameOfBook, String fioAuthor, LocalDate yearPublishing, String genreBook, int countOfPage) {
        this.nameOfBook = nameOfBook;
        this.fioAuthor = fioAuthor;
        this.yearPublishing = yearPublishing;
        this.genreBook = genreBook;
        this.countOfPage = countOfPage;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook() {
        System.out.print("Name of book: ");
        this.nameOfBook = scan.nextLine();
    }

    public String getFioAuthor() {
        return fioAuthor;
    }

    public void setFioAuthor() {
        System.out.print("Name and last name of author: ");
        this.fioAuthor = scan.nextLine();
    }

    public LocalDate getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(LocalDate yearPublishing) {
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        System.out.print("Year publishing: ");
        this.yearPublishing = LocalDate.of(day, month, year);
    }

    public String getGenreBook() {
        return genreBook;
    }

    public void setGenreBook() {
        System.out.print("Genre of book: ");
        this.genreBook = scan.nextLine();
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage() {
        System.out.print("Count of page: ");
        this.countOfPage = scan.nextInt();
    }



}
