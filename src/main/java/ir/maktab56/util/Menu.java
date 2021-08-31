package ir.maktab56.util;

import java.util.InputMismatchException;

public class Menu {
        static Integer pointer;
        static Boolean isTeacher;
        public void printWelcomeMenu(){
                try {
                        System.out.println("...............................");
                        System.out.println(".           Welcome           .");
                        System.out.println("...............................");
                        System.out.println(". Are You Student Or Teacher  .");
                        System.out.println(".    1)Student                .");
                        System.out.println(".    2)Teacher                .");
                        System.out.println("_______________________________");
                        System.out.println("Please Enter the <<number>> that you want");
                        System.out.print("-> ");
                        pointer = ApplicationContext.getIntInput().nextInt();
                        switch (pointer){
                                case 1:
                                        isTeacher = false;
                                        printCrudMenu();
                                case 2:
                                        isTeacher = true;
                                        printCrudMenu();
                                default:
                                        System.out.println("|!| Wrong Number value...");
                                        printWelcomeMenu();
                        }
                }catch (InputMismatchException e){
                        System.out.println("|!| Please Enter the Number...");
                        printWelcomeMenu();
                }catch (NullPointerException e){
                        System.out.println("|!| Some thing wrong...");
                        e.printStackTrace();
                }
        }

        public void printCrudMenu(){
                if (isTeacher == false){
                        System.out.println("................................");
                        System.out.println(".         Student Menu         .");
                        System.out.println("................................");
                        System.out.println(".    1.Insert New Student      .");
                        System.out.println(".    2.Find a Student by id    .");
                        System.out.println(".    3.Edit a Student by id    .");
                        System.out.println(".    4.Remove a Student by id  .");
                        System.out.println(".    5.Show all Student        .");
                        System.out.println(".    6.add Another address     .");
                        System.out.println(".    7.Back                    .");
                        System.out.println(".    8.Exit                    .");
                        System.out.println("________________________________");
                        System.out.println("# Please Enter the <<number>> that you want: ");
                        pointer = ApplicationContext.getIntInput().nextInt();
                        System.out.println("________________________________");
                }else if (isTeacher == true) {
                        System.out.println("................................");
                        System.out.println(".         Teacher Menu         .");
                        System.out.println("................................");
                        System.out.println(".   1.Insert New Teacher       .");
                        System.out.println(".   2.Find a Teacher by id     .");
                        System.out.println(".   3.Edit a Teacher by id     .");
                        System.out.println(".   4.Remove a Teacher by id   .");
                        System.out.println(".   5.Show all Teacher         .");
                        System.out.println(".   6.Back                     .");
                        System.out.println(".   7.Exit                     .");
                        System.out.println("________________________________");
                        System.out.println("# Please Enter the <<number>> that you want: ");
                        pointer = ApplicationContext.getIntInput().nextInt();
                        System.out.println("________________________________");
                }else{
                        System.out.println("|!| Some thing wrong...");
                        printWelcomeMenu();
                }
        }

        public Integer getPointer(){
                return pointer;
        }

        public Boolean isTeacher(){
                return isTeacher;
        }
}
