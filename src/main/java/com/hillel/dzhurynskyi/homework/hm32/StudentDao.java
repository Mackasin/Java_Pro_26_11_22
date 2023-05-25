package com.hillel.dzhurynskyi.homework.hm32;

import com.hillel.dzhurynskyi.homework.hm32.entity.Student;

import java.util.Set;

public interface StudentDao {
    Set<Student> getAllStudents();

    Student findStudentById(long id);

    boolean insertStudent(Student student);

    boolean updateStudent(Student student);

    boolean deleteStudent(long id);
}
