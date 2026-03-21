package com.gla.array.Level2;

import java.util.*;
public class BMI{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int number=sc.nextInt();
        double weight[]=new double[number];
        double height[]=new double[number];
        double bmi[]=new double[number];
        String status[]=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter weight(kg) and height(m) of person "+(i+1)+":");
            weight[i]=sc.nextDouble();
            height[i]=sc.nextDouble();
        }
        for(int i=0;i<number;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<18.4)
                status[i]="Underweight";
            else if(bmi[i]<24.9)
                status[i]="Normal";
            else if(bmi[i]<39.9)
                status[i]="Overweight";
            else
                status[i]="Obese";
        }
        System.out.println("Height Weight BMI Status");
        for(int i=0;i<number;i++){
            System.out.println(height[i]+" "+weight[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
