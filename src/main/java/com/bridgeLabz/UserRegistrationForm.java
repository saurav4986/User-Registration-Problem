package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * (UC-1_First_Name)
 As a User need to enter a valid First Name
 - First name starts with Cap and has minimum 3 characters
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
    }
}
