package com.gla.array.Level2;

import java.util.*;
public class Frequency{
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
        int freq[]=new int[10];
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(i+" - "+freq[i]);
        }
    }
}
