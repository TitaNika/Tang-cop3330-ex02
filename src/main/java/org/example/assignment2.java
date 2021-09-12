/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment2 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the string? ");

        String string = scan.nextLine();

        System.out.println(string + " has " + string.length() + " characters. ");
    }

}