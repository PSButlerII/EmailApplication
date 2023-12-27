package com.recondev;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello please enter client or employee first name.!");
        String firstName =scanner.nextLine();
        System.out.println("Hello please enter client or employee last name.!");
        String lastName =scanner.nextLine();
        if(firstName.isEmpty() && lastName.isEmpty()){
            firstName = "John";
            lastName = "Doe";
//            System.out.println("Please enter a valid name.!");
//            System.exit(0);
        }
        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());
    }
}