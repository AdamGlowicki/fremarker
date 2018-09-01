package com.infoshareacademy.repository;

import com.infoshareacademy.model.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudentRepository {

    private final List<Student> students;

    public StudentRepository() {
        final List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jan", "Kowalski", Arrays.asList(2, 3, 4, 1), true));
        students.add(new Student(2, "Anna", "Kwiatkowska", Arrays.asList(5, 6, 4, 4, 3), false));
        students.add(new Student(3, "John", "Smith", Arrays.asList(), true));

        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
