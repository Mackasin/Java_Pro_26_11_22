package com.hillel.dzhurynskyi.homework.hm32.hibernate;

import com.hillel.dzhurynskyi.homework.hm32.StudentDao;
import com.hillel.dzhurynskyi.homework.hm32.entity.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentDaoImpl implements StudentDao {
    HibernateSession hibernateSession = new HibernateSession();

    @Override
    public Set<Student> getAllStudents() {
        Set<Student> students = new HashSet<>();
        try {
            hibernateSession.sessionObj = HibernateSession.sessionFactory.openSession();
            students = new HashSet<>(hibernateSession.sessionObj.createQuery("FROM Student ", Student.class).list());
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession.sessionObj != null) {
                hibernateSession.sessionObj.close();
            }
        }
        return students;
    }

    @Override
    public Student findStudentById(long id) {
        Student student = null;
        try {
            hibernateSession.sessionObj = HibernateSession.sessionFactory.openSession();

            student = hibernateSession.sessionObj.get(Student.class, id);
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession.sessionObj != null) {
                hibernateSession.sessionObj.close();
            }
        }
        return student;
    }

    @Override
    public boolean insertStudent(Student student) {
        boolean result = false;
        try {
            // Getting Session Object From SessionFactory
            hibernateSession.sessionObj = HibernateSession.sessionFactory.openSession();
            // Getting Transaction Object From Session Object
            hibernateSession.sessionObj.beginTransaction();

            hibernateSession.sessionObj.persist(student);

            // Committing The Transactions To The Database
            hibernateSession.sessionObj.getTransaction()
                    .commit();
            result = true;
            System.out.printf("\nSuccessfully Created Records In The Database!\n");
        } catch (Exception sqlException) {
            if (null != hibernateSession.sessionObj.getTransaction()) {
                System.out.println(".......Transaction Is Being Rolled Back.......\n");
                hibernateSession.sessionObj.getTransaction()
                        .rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession.sessionObj != null) {
                hibernateSession.sessionObj.close();
            }
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean result = false;
        try {
            // Getting Session Object From SessionFactory
            hibernateSession.sessionObj = HibernateSession.sessionFactory.openSession();
            // Getting Transaction Object From Session Object
            hibernateSession.sessionObj.beginTransaction();
            hibernateSession.sessionObj.merge(student);
            // Committing The Transactions To The Database
            hibernateSession.sessionObj.getTransaction()
                    .commit();
            result = true;
            System.out.println("Order With Id= " + student.getId() + " Is Successfully Updated In The Database!\n");
        } catch (Exception sqlException) {
            if (null != hibernateSession.sessionObj.getTransaction()) {
                System.out.println(".......Transaction Is Being Rolled Back.......\n");
                hibernateSession.sessionObj.getTransaction()
                        .rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession.sessionObj != null) {
                hibernateSession.sessionObj.close();
            }
        }
        return result;
    }

    @Override
    public boolean deleteStudent(long id) {
        boolean result = false;
        try {
            // Getting Session Object From SessionFactory
            hibernateSession.sessionObj = HibernateSession.sessionFactory.openSession();
            // Getting Transaction Object From Session Object
            hibernateSession.sessionObj.beginTransaction();

            hibernateSession.sessionObj.remove(hibernateSession.sessionObj.get(Student.class, id));

            // Committing The Transactions To The Database
            hibernateSession.sessionObj.getTransaction()
                    .commit();
            result = true;
            System.out.println("Order With Id= " + id + " Is Successfully deleted from The Database!\n");
        } catch (Exception sqlException) {
            if (null != hibernateSession.sessionObj.getTransaction()) {
                System.out.println(".......Transaction Is Being Rolled Back.......\n");
                hibernateSession.sessionObj.getTransaction()
                        .rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession.sessionObj != null) {
                hibernateSession.sessionObj.close();
            }
        }
        return result;

    }
}
