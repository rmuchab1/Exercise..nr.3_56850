package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class TASK_5 {
    public static void main(String[] args) {
        int collectionSize = 10, i=1;
        int number, min =101, max = 0;
        System.out.println("The program draws"+ collectionSize + "integer numbers from 1 to 100");
        System.out.println("And finds the biggest and smallest of them");

        Random r = new Random();
        System.out.println("Drawn: ");

        while (i <= collectionSize){
            number = Math.round((r.nextInt(100)+1));
            System.out.println(number + ", ");

            if(number < min) min = number;
            if(number > max) max = number;

            i++;
        }
        System.out.println("");
        System.out.println("The largest number in the collection is: " + max);
        System.out.println("The smallest number in the collection is:" + min);

    }
}
