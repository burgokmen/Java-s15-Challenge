package com.brutech.model.memberRecord;

import com.brutech.model.enums.MemberType;

public abstract class memberRecord {
    private int memberId;
    private MemberType type;
    private String dateOfMembership;
    private int numberOfBooksBorrowed;
    private final int maxNumBooksBorrowed = 5;
    private String name;
    private String address;
    private long cellular;



}
