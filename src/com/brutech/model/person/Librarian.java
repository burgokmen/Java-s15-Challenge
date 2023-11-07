package com.brutech.model.person;

import com.brutech.model.books.Book;

public class Librarian extends Person {
    private final int id = 1;
    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    @Override
    public String whoYouAre() {
        return null;
    }
    @Override
    public void removeBook(Book book){

    }

}
