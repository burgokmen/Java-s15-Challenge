package com.brutech.model.person;

import com.brutech.model.books.Book;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String whoYouAre();

    public Book borrowBook(Book book){
        return book;
    }

  public void addBook(Book book){

  }

  public void returnBook(Book book){

  }

  public void removeBook(Book book){

  }
}
