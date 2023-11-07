package com.brutech.model.books;

public class Magazine extends Book {

    public Magazine(long id, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        super(id, author, title, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {

        return "Magazine{" +
                "MagazineId=" + getBookId() +
                ", author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice();

    }
}
