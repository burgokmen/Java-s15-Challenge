package com.brutech.model.person;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String whoYouAre();
}
