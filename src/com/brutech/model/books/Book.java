package com.brutech.model.books;

import java.util.Objects;

public abstract class Book implements Borrowable {
    private long id;
    private String author;
    private String title;
    private double price;

    private String genre;
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


    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
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
    return Objects.equals(title, book.title) &&
            Objects.equals(author, book.author) &&
            Objects.equals(genre, book.genre);
}

@Override
public int hashCode() {
    return Objects.hash(title, author, genre);
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
