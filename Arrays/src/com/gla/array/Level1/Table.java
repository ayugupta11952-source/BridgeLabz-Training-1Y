package com.gla.array.Level1;

import java.util.*;
public class Table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=n*(i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(n+" * "+(i+1)+" = "+a[i]);
        }
    }
}
