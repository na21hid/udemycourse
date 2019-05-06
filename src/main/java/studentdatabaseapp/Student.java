package studentdatabaseapp;

import java.util.Scanner;

/**
 * Created by amir on 5/3/19.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private String studentID;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor prompt user to enter student's name and year
      public Student(){
          Scanner scanner = new Scanner(System.in);
          System.out.println(" Enter student first name: ");
          this.firstName = scanner.nextLine();

          System.out.println(" Enter student last name: ");
          this.lastName = scanner.nextLine();

          System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
          this.gradeYear = scanner.nextInt();

          setStudentID();

//          System.out.println(firstName + " " + lastName +" " + gradeYear + " "+ studentID);

       //   id ++;

      }
    // generic an Id
    private void setStudentID(){
        //Grade level + ID
        id ++;
       this.studentID =  gradeYear + " " + id;

    }
    // Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (0 to  quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")){
                courses = courses + " \n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
//                System.out.println("Break");
                break;

            }
        }while (1 != 0);
//        System.out.println(" ENROLLED ID: " + courses);
//        System.out.println(" TUITION BALANCE: "+ tuitionBalance);
    }

    // view balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    // pay tuition
//    public void payTution(int payment){
//        tuitionBalance = tuitionBalance - payment;
//        System.out.println("Thank you for your payment of $ " + payment);
//        viewBalance();
//    }

    public void payTution(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        viewBalance();
    }
    // Show status
    public String showInfo(){
        return "Name: "+ firstName + " " + lastName +
                "\nGrade level: "+ gradeYear +
                "\nStudent Id: " + studentID +
                "\nCourses Enroll: " + courses +
                "\nBalance: $ "  + tuitionBalance;
    }
}
