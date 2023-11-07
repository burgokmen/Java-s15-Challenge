package com.brutech.model.person;

import java.util.List;
import java.util.Set;

public class Member extends Person {
    private List<String> books;


    public Member(String name, List<String> books) {
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
