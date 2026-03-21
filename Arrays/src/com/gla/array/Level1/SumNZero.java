package com.gla.array.Level1;

import java.util.*;
public class SumNZero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        double total=0.0;
        int i=0;
        while(true){
            double n=sc.nextDouble();
            if(n<=0)
                break;
            if(i==10)
                break;
            a[i]=n;
            i++;
        }
        for(int j=0;j<i;j++){
            System.out.println(a[j]);
            total+=a[j];
        }
        System.out.println("Total = "+total);
    }
}

