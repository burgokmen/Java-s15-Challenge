package com.brutech.main;

import com.brutech.model.Library;
import com.brutech.model.enums.MemberType;
import com.brutech.model.memberRecord.FacultyRecord;
import com.brutech.model.memberRecord.StudentRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library brutech = new Library();
        StudentRecord bru = new StudentRecord(1, MemberType.STUDENT, "2020-01-01", "Bru", "Brutech", 1234567890);
        StudentRecord icardi = new StudentRecord(2, MemberType.STUDENT, "2022-02-05", "Icardi", "Inter", 1234567890);
        FacultyRecord admin = new FacultyRecord(3, MemberType.FACULTY, "2003-02-05", "Admin", "Brutech", 1234567890);

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



