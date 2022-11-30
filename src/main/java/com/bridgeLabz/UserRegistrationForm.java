package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * (UC-3_Email)
 As a User need to enter a valid email
 - E.g. abc.xyz@bl.co.in
 - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
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
    }
}
