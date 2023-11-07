package com.brutech.model.books;

public class Journal extends Book {
    public Journal(long id, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        super(id, author, title, price, status, edition, dateOfPurchase);
    }

    @Override
    public String toString() {

            return "Journal{" +
                    "JournalId=" + getBookId() +
                    ", author='" + getAuthor()
                  ;

    }
}
