package com.brutech.model.person;

import java.util.Set;

public class Author extends Person{
    private String name;
    private Set<String> books;

    public Author(Set<String> books, String name) {
        super(name);
        this.books = books;
    }

    public Set<String> showBook() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    public void newBook(String newBook){
        books.add(newBook);
    }

    @Override
    public String whoYouAre() {
        String bk = books.size() > 1 ? "books" : "book";
        return name + "the Author of"+ " "  + books.size() + " " + bk;
    }

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books +
                '}';
    }
}
