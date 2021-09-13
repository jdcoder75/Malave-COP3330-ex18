package org.example;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Jose Malave
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                           "Press F to convert from Celsius to Fahrenheit.");
        String temp = sc.nextLine();

        if( temp.contains("F") || temp.contains("f"))
        {
            System.out.println("Your choice: " + temp + "\n" +
                                "Please enter the temperature in Celsius: " );
            int startingTemp = sc.nextInt();

            int cal = (startingTemp - (5/9)) - 32;
            System.out.println("The temperature in Celsius is " + cal);

        }
        else if(temp.contains("C") || temp.contains("c"))
        {
            System.out.println("Your choice: " + temp + "\n" +
                    "Please enter the temperature in Fahrenheit: " );
            int startingTemp = sc.nextInt();

            int cal = (startingTemp - 32) * (5/9);
            System.out.println("The temperature in Celsius is " + cal);
        }


    }

}
