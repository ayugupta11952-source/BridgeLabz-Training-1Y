package com.gla.array.Level1;

import java.util.*;
public class Table6to9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int multiplicationResult[]=new int[10];
        for(int i=6;i<=9;i++){
            multiplicationResult[i]=number*i;
        }
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+multiplicationResult[i]);
        }
    }
}
