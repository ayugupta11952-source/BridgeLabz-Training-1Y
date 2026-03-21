package com.gla.array.Level1;

import java.util.*;
    public class Vote{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a[]=new int[10];
            System.out.println("Enter age of 10 students:");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<a.length;i++){
                if(a[i]<0)
                    System.out.println("Invalid age");
                else if(a[i]>=18)
                    System.out.println("The student with the age "+a[i]+" can vote");
                else
                    System.out.println("The student with the age "+a[i]+" cannot vote");
            }
        }
    }
