package ir.maktab56.util;

import ir.maktab56.repository.impl.StudentRepositoryImpl;
import ir.maktab56.repository.impl.TeacherRepositoryImpl;
import ir.maktab56.service.impl.StudentServiceImpl;
import ir.maktab56.service.impl.TeacherServiceImpl;
import java.util.Scanner;

public class ApplicationContext {
    private static final StudentRepositoryImpl studentRepositoryImpl = new StudentRepositoryImpl(HibernateUtil.getEntityManagerFactory().createEntityManager());
    private static final StudentServiceImpl studentServiceImpl = new StudentServiceImpl(studentRepositoryImpl);

    private static final TeacherRepositoryImpl teacherRepositoryImpl = new TeacherRepositoryImpl(HibernateUtil.getEntityManagerFactory().createEntityManager());
    private static final TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl(teacherRepositoryImpl);

    private static final Scanner intInput = new Scanner(System.in);
    private static final Scanner stringInput = new Scanner(System.in);


    public static StudentRepositoryImpl getStudentRepositoryImpl(){
        return studentRepositoryImpl;
    }

    public static StudentServiceImpl getStudentServiceImpl(){
        return studentServiceImpl;
    }

    public static TeacherServiceImpl getTeacherServiceImpl(){
        return teacherServiceImpl;
    }

    public static TeacherRepositoryImpl getTeacherRepositoryImpl(){
        return teacherRepositoryImpl;
    }

    public static Scanner getIntInput(){
        return intInput;
    }

    public static Scanner getStringInput(){
        return stringInput;
    }
}
