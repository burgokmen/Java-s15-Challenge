package com.brutech.model.books;

import java.util.Objects;

public abstract class Book implements Borrowable {
    private int BookId;
    private String author;
    private String title;
    private double price;
    private boolean status;
    private String edition;
    private String dateOfPurchase;

    public Book(int bookId, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        BookId = bookId;
        this.author = author;
        this.title = title;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getBookId() {
        return BookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public String getEdition() {
        return edition;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void changeOwner(int BookId){

    };

    @Override
    public void updateBorrowStatus() {
        this.status =  !status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return BookId == book.BookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookId);
    }


    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }
}
