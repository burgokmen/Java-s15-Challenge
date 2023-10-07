package com.brutech.model.books;

import com.brutech.model.enums.Course;

public class StudyBooks extends Book {

    private Course course;
    public StudyBooks(int bookId, String author, String title, double price, boolean status, String edition, String dateOfPurchase) {
        super(bookId, author, title, price, status, edition, dateOfPurchase);
    }


}
