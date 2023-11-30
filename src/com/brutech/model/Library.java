package com.brutech.model;

import com.brutech.model.books.Book;
import com.brutech.model.books.Journal;
import com.brutech.model.books.Magazine;
import com.brutech.model.books.StudyBook;
import com.brutech.model.memberRecord.MemberRecord;

import java.util.*;

public class Library {

    public Map<String, Integer> bookMap = new TreeMap<>();
    private List<Book> bookList = new ArrayList<>();
    private Set<Book> categorizedBookSet = new LinkedHashSet<>();


    private List<MemberRecord> personList = new LinkedList<>();


    public Library() {
       Book book1 = new Magazine(1, "testMagazine0" , "testMagazine0", 10, true, "1st", "01.01.2021");
       Book book2 = new Journal(2, "National Geographic", "National Geographic", 5, true, "1st", "01.01.2021");
       Book book3 = new StudyBook(3, "testMath", "testMath", 8, true, "1st", "01.01.2021");
       Book book4 = new StudyBook(4, "testScience", "testScience", 2, true, "1st", "01.01.2021");
       Book book5 = new StudyBook(5, "testEnglish", "testEnglish", 2, true, "1st", "01.01.2021");
       Book book6 = new StudyBook(6, "testTurkish", "testTurkish", 2, true, "1st", "01.01.2021");
       Book book7 = new Journal(7, "testJournal", "testJournal", 5, true, "1st", "01.01.2021");
       Book book8 = new Magazine(8, "testMagazine", "testMagazine", 7, true, "1st", "01.01.2021");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);




        stockCheck();


    }

    public Map<String, Integer> stockCheck() {
        for (Book book : bookList) {
            bookMap.put(book.getTitle(), 0);
        }
        for (Book book : bookList) {
            if (bookMap.containsKey(book.getTitle())) {

                bookMap.put(book.getTitle(), bookMap.get(book.getTitle()) + 1);

            }
        }
        return bookMap;
    }

    public List<MemberRecord> getPersonList() {
        return personList;
    }

    public void setPersonList(List<MemberRecord> personList) {
        this.personList = personList;
    }

    public void addPersonToLibrary(MemberRecord person) {
        personList.add(person);
    }

    public void setBookMap(Map<String, Integer> bookMap) {
        this.bookMap = bookMap;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


    public Map<String, Integer> getBookMap() {
        return bookMap;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book searchBookById(int id) {
        for (Book book : bookList) {

            if (book.getBookId() == id) {
                return book;

            }


        }
        System.out.println("Please enter a valid Book Id");
        return null;

    }

    public Book searchBookByName(String name) {
        for (Book book : bookList) {

            if (book.getTitle().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                return book;

            }


        }
        System.out.println("Please enter a valid book name");
        return null;

    }

    public Book searchBookByAuthor(String author) {
        for (Book book : bookList) {

            if (book.getAuthor().toLowerCase(Locale.ROOT).contains(author.toLowerCase(Locale.ROOT))) {
                return book;


            }


        }
        System.out.println("Please enter a valid author name");
        return null;

    }

    public void addBook(Book book) {
        bookList.add(book);


    }

    public void editBook(Book oldBook, Book newBook) {

        for (Book book : bookList) {

            if (book.equals(oldBook)) {

                book.setId(newBook.getBookId());
                book.setTitle(newBook.getTitle());
                book.setAuthor(newBook.getAuthor());
                book.setEdition(newBook.getEdition());
                book.setGenre(newBook.getGenre());
                book.setPrice(newBook.getPrice());
                book.setDateOfPurchase(newBook.getDateOfPurchase());
                book.setStatus(newBook.isStatus());

            }
        }
        System.out.println("Please enter a valid book");

    }

    public void removeBook(Book book) {
        if (bookList.contains(book)) {
            bookList.remove(book);
            if (bookMap.get(book.getTitle()) > 0) {
                bookMap.put(book.getTitle(), bookMap.get(book.getTitle()) - 1);
            }
        } else {

            System.out.println("Please select a valid book");
        }


    }



    public Set<Book> listAllByAuthors(String name) {
        if (!categorizedBookSet.isEmpty()) {
            categorizedBookSet.clear();
        }

        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {

                categorizedBookSet.add(book);
            }


        }
        return categorizedBookSet;

    }

    public Set<Book> listAllByCategories(String categories) {
        if (!categorizedBookSet.isEmpty()) {
            categorizedBookSet.clear();
        }
        for (Book book : bookList) {
            if (book.getGenre().equals(categories)) {

                categorizedBookSet.add(book);
            }

        }
        return categorizedBookSet;
    }

    public Set<Book> listAllByStatus(boolean status) {
        if (!categorizedBookSet.isEmpty()) {
            categorizedBookSet.clear();
        }
        for (Book book : bookList) {
            if (book.isStatus() == status) {

                categorizedBookSet.add(book);
            }

        }
        return categorizedBookSet;


    }

    public Set<Book> listAllByDate(String date) {
        if (!categorizedBookSet.isEmpty()) {
            categorizedBookSet.clear();
        }
        for (Book book : bookList) {
            if (book.getDateOfPurchase().equals(date)) {

                categorizedBookSet.add(book);
            }

        }
        return categorizedBookSet;


    }
}