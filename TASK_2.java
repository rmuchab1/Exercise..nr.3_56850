package com.company.Task2_BMI;

import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;


public class TASK_2 {
    public static void main(String[] args) throws IOException {


        float heightBob  , weightBob , bmiBob ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate your BMI ");
        System.out.println("Enter your height in cm (and press Enter ):  ");
        heightBob = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight ( and press Enter): ");
        weightBob = Float.parseFloat(br.readLine());

        bmiBob = (float) (weightBob / (Math.pow(heightBob, 2)));
        System.out.printf("Your BMI is : "  + "%2.2f, \n" , bmiBob);

        if (bmiBob <16 ){
            System.out.println("Your are starving");
        } else if ((bmiBob>=16)&& (bmiBob < 16.99)){
            System.out.println("You´re emaciated");
        } else if ((bmiBob>=17)&&(bmiBob<18.49)) {
            System.out.println("You´re underweight");
        } else if ((bmiBob>=18.50)&&(bmiBob < 22.99)) {
            System.out.println("You are in the low range of the norm");
        } else if ((bmiBob >= 23)&& (bmiBob< 24.99)) {
            System.out.println("You´re in the high range of the norm");
        } else if ((bmiBob>= 25)&& (bmiBob < 27.49)) {
            System.out.println("You are overweight (pre-obese");
        }  else if ((bmiBob>= 27.50)&& (bmiBob < 29.99)) {
            System.out.println("You are overweight ");
        }  else if ((bmiBob>= 30)&& (bmiBob < 34.99)) {
            System.out.println("You have 1st degree obesity");
        }  else if ((bmiBob>= 35)&& (bmiBob < 39.99)) {
            System.out.println("You have 2nd degree obesity");
        }  else if ((bmiBob> 40)) {
            System.out.println("You have 3rd degree obesity");
        }



    }
}
