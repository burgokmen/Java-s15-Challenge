package com.brutech.model.memberRecord;

import com.brutech.model.enums.MemberType;

import java.time.LocalDate;

public class StudentRecord extends MemberRecord {

    public StudentRecord(int memberId, MemberType type, LocalDate dateOfMembership, String name, String address, long cellular) {
        super(memberId, type, dateOfMembership, name, address, cellular);
    }

    @Override
    public void returnBookMessage() {

    }
}
