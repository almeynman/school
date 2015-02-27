package com.epam.aa.school.model;

/**
 * Created by almas on 28/02/2015.
 */
public class Role extends BaseEntity{
    public static final Role DIRECTOR = new Role("Director");
    public static final Role DEPARTMENT_HEAD = new Role("Head of Department");

    String title;

    public Role(String title) {
        this.title = title;
    }
}
