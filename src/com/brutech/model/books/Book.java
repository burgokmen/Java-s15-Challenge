package com.brutech.model.books;

import java.util.Objects;

public abstract class Book implements Borrowable {
    private long id;
    private String author;
    private String title;
    private double price;
    private boolean status;
    private String edition;
    private String dateOfPurchase;

    public Book(long id, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public long getBookId() {
        return id;
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

    public void changeOwner(long id){

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
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId());
    }


    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }
}
