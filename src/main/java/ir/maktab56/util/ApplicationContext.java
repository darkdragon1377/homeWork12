package ir.maktab56.util;

import ir.maktab56.domain.Student;
import ir.maktab56.domain.Teacher;
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
    private static final Menu menu = new Menu();
    private static final Layer layer = new Layer();

    private static Student student;
    public static  Student getStudent() {
        return student;
    }
    public static void setStudent(Student student) {
        ApplicationContext.student = student;
    }

    private static Teacher teacher;
    public static Teacher getTeacher(){
        return teacher;
    }
    public static void setTeacher(Teacher teacher){
        ApplicationContext.teacher = teacher;
    }

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

    public static Layer getLayer(){
        return layer;
    }

    public static Menu getMenu(){
        return menu;
    }
}
