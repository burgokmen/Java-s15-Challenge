package com.brutech.model.enums;

public enum Course {
    MATH( "Mathematics", 1),
    PSY("Psychology", 2),
    SOC("Sociology", 3),
    CS("Computer Science", 4),
    EC("Economics", 5);

    private String courseName;
    private int courseCode;

    Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    // enum Course has a setter . Librarian could use that setter to add new course types

    // TODO we may add extra limit if the membership date is more than 5 years or
    // professor or a student wants to borrow extra book from their related areas.
    // TODO show library method needs to review in Library class
    // TODO LocalDate sinifini date tutmak icin kullan
    // Recommendation System:
    // Implement a recommendation engine that suggests books based on a user's reading history or interests.


}


