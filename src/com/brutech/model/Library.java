package com.brutech.model;

import java.util.List;
import java.util.Map;


public class Library {
    private List<String> books;
    private Map<String, String> readers;

    public Library(List<String> books, Map<String, String> readers) {
        this.books = books;
        this.readers = readers;
    }

    public List<String> getBooks() {
        return books;
    }

    public Map<String, String> getReaders() {
        return readers;
    }

    public void newBook(String book){
        books.add(book);
    }

    public void lendBook(String book, String reader){
        readers.put(book, reader);
    }
    public void takeBackBook(String book, String reader){
        readers.remove(book, reader);
    }

    public String showBook(String book){
        //TODO showBook
    }


}
