package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * (UC-13_Lambda)
 Refactor the Code to use Lambda Function to validate User Entry
 - Use Lambda Function to validate First_Name, Last_Name, Email, Mobile, and Password */
public class UserRegistrationForm {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Master
        System.out.println("Welcome to User Registration program");

        System.out.println("Please enter your First Name: ");
        String firstName = sc.nextLine();
        checkFirstName(firstName);

        System.out.println("Please enter your Last Name: ");
        String lastName = sc.nextLine();
        checkLastName(lastName);

        System.out.println("Please enter your Email Address: ");
        String email = sc.nextLine();
        checkEmailAddress(email);

        System.out.println("Please enter your Mobile Number: ");
        String mobileNumber = sc.nextLine();
        checkMobileNumber(mobileNumber);

        System.out.println("Please enter your Password: ");
        String password = sc.nextLine();
        checkPassword(password);
        System.out.println("Thank you for using Registering user!");
        sc.close();
    }

    public static boolean checkPassword(String password) {
        // Password:
        // UC5: Password with the rule of minimum 8 characters
        // String passwordPattern="[A-Za-z0-9]{8,}$"; should have minimum 8 characters

        // UC6: Password with the rule of minimum 1 capital letter
        // String passwordPattern="^(?=.*[A-Z])([A-Za-z0-9]){8,}$";

        // UC7: Password with the rule of minimum 1 number in the password
        // String passwordPattern="^(?=.*[0-9])(?=.*[A-Z])([A-Za-z0-9]){8,}$";

        // UC8:Password with the rule of only 1 special character
        String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])([A-Za-z0-9~!@#$%^&*()<>:{},.;']){8,}$";
        //boolean passwordCheck = Pattern.matches(passwordPattern, password);
        IUserRegistration patternMatcher = (i1, i2) -> Pattern.matches(i2, i1);
        boolean passwordCheck = patternMatcher.checkValidation(passwordPattern, password);

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i))) {
                count++;
            }
        }
        boolean flag=false;

        if (passwordCheck) {
            if (count == 0 || count > 1) {
                System.out.println("Sorry! you have entered invalid Password");

            } else {
                flag=true;
                System.out.println("You have entered valid Password");
            }
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Password");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("BAD Test");
            }
        }
        return flag;

    }

    public static boolean checkMobileNumber(String mobileNumber) {
        // UC4: Mobile Number
        String mobileNumberPattern = "^[+91]{3,} [0-9]{10}$";
        IUserRegistration patternMatcher = (i1, i2) -> Pattern.matches(mobileNumberPattern, mobileNumber);
        boolean mnCheck = patternMatcher.checkValidation(mobileNumberPattern, mobileNumber);
        //boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
        if (mnCheck) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Mobile Number");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("BAD Test");
            }
        }
        return mnCheck;
    }

    public static boolean checkEmailAddress(String email) {
        // UC3: Email
        //String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]*@+[a-z0-9]+[.]+([a-z]*[.]*)[a-z]{2,}$";
        /*
         * UC9:Email Sample to check abc@yahoo.com abc-100@yahoo.com abc.100@yahoo.com
         * abc111@abc.com abc-100@abc.net abc.100@abc.com.au abc@1.com abc@gmail.co
         * abc+100@gmail.com
         */
        //boolean emailCheck = Pattern.matches(emailPattern, email);
        String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
        IUserRegistration patternMatcher = (i1, i2) -> Pattern.matches(emailPattern, email);
        boolean emailCheck = patternMatcher.checkValidation(emailPattern, email);
        if (emailCheck) {
            System.out.println("You have entered valid Email Address");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Email");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("BAD Test");
            }
        }
        return emailCheck;

    }

    public static boolean checkLastName(String lastName) {
        // UC2:Last Name
        //boolean lastNameCheck = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        String lastNamePattern = "^[A-Z][a-z]{2,}$";
        IUserRegistration patternMatcher = Pattern::matches;
        boolean lastNameCheck = patternMatcher.checkValidation(lastNamePattern, lastName);
        if (lastNameCheck) {
            System.out.println("You have entered valid Last Name");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Name");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("BAD Test");
            }
        }
        return lastNameCheck;

    }

    public static boolean checkFirstName(String firstName) {
        // UC1:First Name
        //boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        String firstNamePattern = "^[A-Z][a-z]{2,}$";
        IUserRegistration patternMatcher = (p1, p2) -> Pattern.matches(p1, p2);
        boolean firstNameCheck = patternMatcher.checkValidation(firstNamePattern, firstName);
        if (firstNameCheck) {
            System.out.println("You have entered valid First Name");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Name");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("BAD Test");
            }
        }
        return firstNameCheck;
    }
}