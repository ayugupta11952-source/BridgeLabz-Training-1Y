package com.gla.array.Level2;

import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int temp=number,count=0;
        for(;temp!=0;temp=temp/10)
            count++;
        int digits[]=new int[count];
        temp=number;
        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp=temp/10;
        }
        System.out.println("Reversed digits:");
        for(int i=0;i<count;i++){
            System.out.print(digits[i]);
        }
    }
}
