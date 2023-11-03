package com.brutech.model.person;

import java.util.Set;

public class Member extends Person {
    private Set<String> books;


    public Member(String name, Set<String> books) {
        super(name);
        this.books = books;
    }

    @Override
    public String whoYouAre() {
        String bk = books.size() > 1 ? "books" : "book";
        return getName() + "borrowed"+ " "  + books.size() + " " + bk;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + getName() + '\'' +
                ", books=" + books +
                '}';
    }
}
