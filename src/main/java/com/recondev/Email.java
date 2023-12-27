package com.recondev;

import java.util.Map;
import java.util.Scanner;

public class Email {


    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength=12;
    private String alternateEmail;
    private String companySuffix = ".recondev.com";


    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created: " + this.firstName + " " + this.lastName);
        // Call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        //System.out.println("Your email is: " + email);



    }


    private String randomPassword(int i) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+;:<>?/.";
        char[] password = new char[i];
        for (int j = 0; j < i; j++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[j] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");// convert to a switch statement

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        switch (depChoice){
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "";
        }
//        if (depChoice == 1) {
//            return "sales";
//        } else if (depChoice == 2) {
//            return "dev";
//        } else if (depChoice == 3) {
//            return "acct";
//        } else {
//            return "";
//        }
    }

    public Map<String,String> getUserInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();

        Map<String,String> userInfo = Map.of("firstName",firstName,"lastName",lastName);
        return userInfo;
    }


    //Set mail box capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }



    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nDEPARTMENT: " + department +
                "\nCOMPANY EMAIL: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
