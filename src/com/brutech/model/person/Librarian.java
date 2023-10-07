package com.brutech.model.person;

public class Librarian extends Person {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    @Override
    public String whoYouAre() {
        return null;
    }
}
