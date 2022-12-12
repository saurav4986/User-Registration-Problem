package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidUserDetailsException extends Exception{

    InvalidUserDetailsException(String message){
        super(message);
    }
}

/*
public class CustomException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println(validateName(firstName));

        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println(validateName(lastName));

        System.out.print("Enter Email : ");
        String email = scanner.next();
        System.out.println(validateEmail(email));

        System.out.print("Enter Mobile Number : ");
        String mNumber = scanner.next();
        System.out.println(validatingMobile(mNumber));

        System.out.print("Enter Password : ");
        String password = scanner.next();
        System.out.println(validatePassword(password));
    }

    */
/**
     * Method for validating the user first and last  name using regex.
     *
     *//*

    public static boolean validateName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        if (name == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            try {
                throw new InvalidUserDetailsException("Invalid Name");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }


    */
/**
     * Method for validating the user's email using regex
     *
     *//*

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9.+-]+[@]+[a-zA-z0-9]+[.]+[a-zA-z0-9.]{2,}$");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            try {
                throw new InvalidUserDetailsException("Invalid Email");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }

    */
/**
     * Method for validating the user's mobile number using regex
     *
     *//*

    public static boolean validatingMobile(String mNumber) {
        Pattern pattern = Pattern.compile("^[9][1]+\\s\\d{10}$");
        if (mNumber == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(mNumber);
        if (matcher.matches())
            return true;
        else
            try {
                throw new InvalidUserDetailsException("Invalid Mobile Number");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }

    */
/**
     * Method for validating the user's password using regex.
     * Rule1 – minimum 8 characters
     * Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
     * Rule3 – Should have at least 1 numeric number in the password
     * Rule4 – Has exactly 1 Special Character
     *
     *//*

    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return true;
        else
            try {
                throw new InvalidUserDetailsException("Invalid Password");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }

}
*/

