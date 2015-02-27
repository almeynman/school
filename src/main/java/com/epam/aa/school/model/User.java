package com.epam.aa.school.model;

import java.util.Date;

public abstract class User extends BaseEntity {
    private String email;
    private String password; // question
    private String firstName;
    private String secondName;
    private Date birthDate;
    private String address;
}
