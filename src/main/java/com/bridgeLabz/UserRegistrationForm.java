package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * (UC-7_Pwd_Numeric)
 As a User need to follow pre-defined Password rules.
 Rule1
 – minimum 8 Characters
 - NOTE – All rules must be passed
 Rule2
 – Should have at least 1 Upper Case
 - NOTE – All rules must be passed
 Rule3
 – Should have at least 1 numeric number in the password
 - NOTE – All rules must be passed
 */
public class UserRegistrationForm
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to User Registration!!!" );

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your First Name: ");
        String firstName=sc.next();
        boolean res= Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName);
        if(res) {
            System.out.println("You have entered valid First Name");
        }else {
            System.out.println("Sorry! you have entered invalid First Name");
        }

        System.out.println("Please enter your Last Name: ");
        String lastName = sc.next();
        boolean res1 = Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName);
        if (res1) {
            System.out.println(" You have entered valid Last Name");
        } else {
            System.out.println("Sorry! you have entered invalid Last Name");
        }

        System.out.println("Please enter your Email Address: ");
        String email = sc.next();
        String emailPattern="^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
        boolean emailCheck = Pattern.matches(emailPattern, email);
        if (emailCheck) {
            System.out.println("You have entered valid Email Address");
        } else {
            System.out.println("Sorry! you have entered invalid Email Address");
        }

        System.out.println("Please enter your Mobile Number: ");
        String mobileNumber = sc.next();
        String mobileNumberPattern="^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
        boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
        if (mnCheck) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            System.out.println("Sorry! you have entered invalid Mobile Number");
        }

        System.out.println("Please enter your Password: ");
        String password = sc.next();
        //UC5: Password with the rule of minimum 8 characters
        //String passwordPattern="[A-Za-z0-9]{8,}$"; should have minimum 8 characters

        //UC6: Password with the rule of minimum 1 capital letter
        //String passwordPattern="^(?=.*[A-Z])([A-Za-z0-9]){8,}$";

        //UC7: Password with the rule of minimum 1 number in the password
        String passwordPattern="^(?=.*[0-9])(?=.*[A-Z])([A-Za-z0-9]){8,}$";
        boolean passwordCheck = Pattern.matches(passwordPattern,password);
        if (passwordCheck) {
            System.out.println("You have entered valid Password");
        } else {
            System.out.println("Sorry! you have entered invalid Password");
        }
    }
}
