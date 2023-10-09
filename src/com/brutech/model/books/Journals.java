package com.brutech.model.books;

import com.brutech.model.books.Book;

public class Journals extends Book {
    public Journals(int bookId, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        super(bookId, author, title, price, status, edition, dateOfPurchase);
    }

}
