package com.brutech.model.person;

import java.util.Set;

public class Reader extends Person {
    private String name;
    private Set<String> books;

    public Reader(String name) {
        super(name);
    }



    @Override
    public String whoYouAre() {
        String bk = books.size() > 1 ? "books" : "book";
        return name + "borrowed"+ " "  + books.size() + " " + bk;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
