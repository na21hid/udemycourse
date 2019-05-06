package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by amir on 5/3/19.
 */
public class StudentDataBaseApp {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.enroll();
//        student.payTution();
//        System.out.println(student.showInfo());


        // Ask how many new student we want to add
        System.out.println("Enter numbr of new student to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudent = scanner.nextInt();
        Student[] students = new Student[numOfStudent];



        //Create a number of student
        for( int n = 0; n<numOfStudent ; n ++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();
//            System.out.println(students[n].toString());
        }
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());
//        System.out.println(students[2].toString());
        for( int n = 0; n<numOfStudent ; n ++){
            System.out.println(students[n].toString());
        }
    }
}
