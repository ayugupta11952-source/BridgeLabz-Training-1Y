package com.gla.array.Level1;

import java.util.*;
public class MeanHt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double heights[]=new double[11];
        double sum=0;
        System.out.println("Enter height of 11 players:");
        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextDouble();
        }
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        double mean=sum/11;
        System.out.println("Mean height = "+mean);
    }
}
