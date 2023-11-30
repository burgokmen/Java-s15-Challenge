package com.brutech.model.memberRecord;

import com.brutech.model.enums.MemberType;

public class StudentRecord extends MemberRecord {

    public StudentRecord(int memberId, MemberType type, String dateOfMembership, String name, String address, long cellular) {
        super(memberId, type, dateOfMembership, name, address, cellular);
    }

    @Override
    public void returnBookMessage() {

    }
}
