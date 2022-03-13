package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TASK_1 {

    public static void main(String[] args) throws  IOException {

        float firstNumberBob , secondNumberBob , sum , subtraction , product , quotient ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum , difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (press Enter): ");
        firstNumberBob = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number ( press enter )");
        secondNumberBob = Float.parseFloat(br.readLine());

        sum = firstNumberBob + secondNumberBob ;
        subtraction = firstNumberBob - secondNumberBob ;
        product =firstNumberBob * secondNumberBob ;
        quotient = firstNumberBob / secondNumberBob ;

        System.out.printf("You entered two numbers , the first is:  "+ "%2.2f" ,firstNumberBob);
        System.out.printf(" and the second is:  "+ "%2.2f",secondNumberBob);

        System.out.println();

        System.out.printf("Sum = "+ "%2.2f , \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n" ,+ subtraction);
        System.out.printf("Product = " + "%2.2f , \n" , + product);
        System.out.printf("Quotient = " + "%2.2f , \n", + quotient);




    }
}
