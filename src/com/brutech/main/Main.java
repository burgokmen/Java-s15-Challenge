package com.brutech.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) try {
            System.out.println("Welcome to Brutech Library");
            System.out.println("Please choose your role: ");
            System.out.println("1. Librarian");
            System.out.println("2. Member");
            System.out.println("3. Guest");
            Scanner scanner = new Scanner(System.in);
            int role = scanner.nextInt();
            switch (role) {
                case 1:
                    System.out.println("Welcome Librarian");
                    break;
                case 2:
                    System.out.println("Welcome Member");
                    break;
                case 3:
                    System.out.println("Welcome Guest");
                    break;
                default:
                    System.out.println("Please enter a valid role");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid role");
        }


    }
}

// TODO ideas here
// enum Course has a setter . Librarian could use that setter to add new course types

// TODO we may add extra limit if the membership date is more than 5 years or
// professor or a student wants to borrow extra book from their related areas.

//TODO show library method needs to review in Library class

//TODO LocalDate sinifini date tutmak icin kullan

//Recommendation System:
//Implement a recommendation engine that suggests books based on a user's reading history or interests.
//Book Recommendations from Librarians:
//Enable librarians to recommend books to users based on their preferences.


//Book Availability Calendar:
//Show the availability of each book on a calendar, indicating when a book is available for borrowing.

//Book Status Updates:
//Send notifications to users when a book they're interested in becomes available or when their borrowed books are due.


//Gamification Elements:
//Introduce gamification elements like badges, achievements, and reading challenges to encourage user engagement.
//they may get a badge if they read 10 books in a month, or they may get a badge if they read 100 books in a year.
//their max book limit may increase if they get a badge.




