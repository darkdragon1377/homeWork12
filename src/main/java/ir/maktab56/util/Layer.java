package ir.maktab56.util;

import ir.maktab56.domain.Address;
import ir.maktab56.domain.Student;
import ir.maktab56.domain.Teacher;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Layer {
    static Set<Address> addresses = new HashSet<>();
    public  void studentLayer(){
        Integer pointer = ApplicationContext.getMenu().getPointer();

        switch (pointer){
            case 1:{
                System.out.print("Please Enter Your first Name: ");
                String firstName = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your last Name: ");
                String lastName = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your national Code: ");
                String code = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Year of Your Birth: ");
                int birthYear = ApplicationContext.getStringInput().nextInt();

                System.out.print("Please Enter Month of Your Birth: ");
                int birthMonth = ApplicationContext.getStringInput().nextInt();

                System.out.print("PLease Enter Day of Your Birth: ");
                int birthDay = ApplicationContext.getStringInput().nextInt();

                System.out.println("Please Enter Your Address correctly: ");
                System.out.print("Please Enter Your State: ");
                String state = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your city: ");
                String city = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your street: ");
                String street = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your Postal Code: ");
                String postalCode = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your Plaque: ");
                Integer plaque = ApplicationContext.getIntInput().nextInt();

                Address address = new Address(state, city, street, postalCode, plaque);
                addresses.add(address);

                if (ApplicationContext.getMenu().isTeacher() == false){
                    Student student = new Student(firstName, lastName, code,
                            new Date(birthYear, birthMonth, birthDay), addresses);

                    ApplicationContext.setStudent(student);
                    ApplicationContext.getStudentServiceImpl().insert(student);
                }else {
                    System.out.print("Please Enter Your salary: ");
                    Double salary = ApplicationContext.getStringInput().nextDouble();

                    if (salary == 0){
                        System.out.println("your salary can't be 0");
                        ApplicationContext.getMenu().printWelcomeMenu();
                    }
                    Teacher teacher  = new Teacher(firstName, lastName, code, salary,
                            new Date(birthYear,birthMonth, birthDay), address);

                    ApplicationContext.setTeacher(teacher);
                    ApplicationContext.getTeacherServiceImpl().insert(teacher);
                }
                    System.out.println("\uD83C\uDD97 Inserted Succeed...");
                    ApplicationContext.getMenu().printCrudMenu();
            }
            case 2:{
                if (ApplicationContext.getMenu().isTeacher() == false){
                    System.out.print("Please Enter Your ID: ");
                    Long id = ApplicationContext.getIntInput().nextLong();
                    Student student = ApplicationContext.getStudentServiceImpl().findById(id);
                    System.out.println(student.toString());
                    ApplicationContext.getMenu().printCrudMenu();
                }else {
                    System.out.print("Please Enter Your ID: ");
                    Long id = ApplicationContext.getIntInput().nextLong();
                    Teacher teacher = ApplicationContext.getTeacherServiceImpl().findById(id);
                    System.out.println(teacher.toString());
                    ApplicationContext.getMenu().printCrudMenu();
                }
            }
            case 3: {
                System.out.print("Please Enter Your first Name: ");
                String firstName = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your last Name: ");
                String lastName = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your national Code: ");
                String studentCode = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Year of Your Birth: ");
                int birthYear = ApplicationContext.getStringInput().nextInt();

                System.out.print("Please Enter Month of Your Birth: ");
                int birthMonth = ApplicationContext.getStringInput().nextInt();

                System.out.print("PLease Enter Day of Your Birth: ");
                int birthDay = ApplicationContext.getStringInput().nextInt();

                System.out.println("Please Enter Your Address correctly: ");
                System.out.print("Please Enter Your State: ");
                String state = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your city: ");
                String city = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your street: ");
                String street = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your Postal Code: ");
                String postalCode = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your Plaque: ");
                Integer plaque = ApplicationContext.getIntInput().nextInt();

                Address address = new Address(state, city, street, postalCode, plaque);
                addresses.add(address);

                Student student = new Student(firstName, lastName, studentCode,
                        new Date(birthYear,birthMonth, birthDay),addresses);

                ApplicationContext.setStudent(student);
                ApplicationContext.getStudentServiceImpl().update(student);
            }
            case 4:{
                if (ApplicationContext.getMenu().isTeacher() == false){
                    System.out.print("Please Enter Your ID: ");
                    Long id = ApplicationContext.getIntInput().nextLong();
                    Student student = ApplicationContext.getStudentServiceImpl().findById(id);
                    ApplicationContext.getStudentServiceImpl().delete(student);
                }else {
                    System.out.print("Please Enter Your ID: ");
                    Long id = ApplicationContext.getIntInput().nextLong();
                    Teacher teacher = ApplicationContext.getTeacherServiceImpl().findById(id);
                    ApplicationContext.getTeacherServiceImpl().delete(teacher);
                }
                ApplicationContext.getMenu().printCrudMenu();
            }
            case 5:
                //TODO showAll
            case 6:
                System.out.println("Please Enter Your Address correctly: ");
                System.out.print("Please Enter Your State: ");
                String state = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your city: ");
                String city = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your street: ");
                String street = ApplicationContext.getStringInput().nextLine();

                System.out.print("Please Enter Your Postal Code: ");
                String postalCode = ApplicationContext.getStringInput().next();

                System.out.print("Please Enter Your Plaque: ");
                Integer plaque = ApplicationContext.getIntInput().nextInt();

                Address address = new Address(state, city, street, postalCode, plaque);
                Set<Address> studentAddressList = ApplicationContext.getStudent().getAddress();
                studentAddressList.add(address);
                ApplicationContext.getStudent().setAddress(studentAddressList);

                System.out.println("New Address Set Succeed");

            case 7:
                ApplicationContext.getMenu().printWelcomeMenu();
            case 8:
                System.exit(0);
            default:
                System.out.println("|!| Wrong Number value...");
                ApplicationContext.getMenu().printCrudMenu();
        }
    }
}
