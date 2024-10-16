package atu.ie;

import java.util.Scanner;


public class StudentApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your email:");
        String email = input.nextLine();
        System.out.println("Enter your course:");
        String course = input.nextLine();
        System.out.println("");
        System.out.println("");

        //first person
        Student student = new Student();
        student.setName(name);
        student.setName(email);
        student.setName(course);
    }
}
