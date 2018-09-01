package com.infoshareacademy.model;

import java.util.List;

public class Student {

    private final Integer id;

    private final String firstName;

    private final String lastName;

    private final List<Integer> grades;

    private final boolean active;

    public Student(Integer id, String firstName, String lastName,
        List<Integer> grades, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", grades=").append(grades);
        sb.append(", active=").append(active);
        sb.append('}');
        return sb.toString();
    }
}
