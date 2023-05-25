package com.hillel.dzhurynskyi.homework.hm32;

import com.hillel.dzhurynskyi.homework.hm32.entity.Student;
import com.hillel.dzhurynskyi.homework.hm32.hibernate.StudentDaoImpl;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao=new StudentDaoImpl();
studentDao.insertStudent(new Student("Max","dfghd@gfdag.com"));
studentDao.updateStudent(new Student(7,"Max","ggggg@gmail.com"));
studentDao.deleteStudent(6);
        System.out.println(studentDao.findStudentById(7));
        System.out.println();
        studentDao.getAllStudents().forEach(System.out::println);

    }
}
