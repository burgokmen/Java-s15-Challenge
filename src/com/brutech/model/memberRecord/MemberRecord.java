package com.brutech.model.memberRecord;

import com.brutech.model.enums.MemberType;

import java.util.Objects;

public abstract class MemberRecord {
    private int memberId;
    private MemberType type;
    private String dateOfMembership;
    private int numberOfBooksBorrowed = 0;
    private final int maxNumBooksBorrowed = 5;
    private String name;
    private String address;
    private long cellular;

    public MemberRecord(int memberId, MemberType type, String dateOfMembership, String name, String address, long cellular) {
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.name = name;
        this.address = address;
        this.cellular = cellular;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public int getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCellular(long cellular) {
        this.cellular = cellular;
    }

    public abstract void returnBookMessage();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberRecord that = (MemberRecord) o;
        return memberId == that.memberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public String toString() {
        return "MemberRecord{" +
                "memberId=" + memberId +
                ", type=" + type +
                ", dateOfMembership='" + dateOfMembership + '\'' +
                ", numberOfBooksBorrowed=" + numberOfBooksBorrowed +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cellular=" + cellular +
                '}';
    }
}
