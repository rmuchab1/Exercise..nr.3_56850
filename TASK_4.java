package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TASK_4 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<100;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
