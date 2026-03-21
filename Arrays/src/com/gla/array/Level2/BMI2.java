package com.gla.array.Level2;

import java.util.*;
public class BMI2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int number=sc.nextInt();
        double personData[][]=new double[number][3];
        String weightStatus[]=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter weight(kg) and height(m) of person "+(i+1)+":");
            personData[i][0]=sc.nextDouble();
            personData[i][1]=sc.nextDouble();
            if(personData[i][0]<=0||personData[i][1]<=0){
                System.out.println("Enter positive values");
                i--;
            }
        }
        for(int i=0;i<number;i++){
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<18.4)weightStatus[i]="Underweight";
            else if(personData[i][2]<24.9)weightStatus[i]="Normal";
            else if(personData[i][2]<39.9)weightStatus[i]="Overweight";
            else weightStatus[i]="Obese";
        }
        System.out.println("Weight Height BMI Status");
        for(int i=0;i<number;i++){
            System.out.println(personData[i][0]+" "+personData[i][1]+" "+personData[i][2]+" "+weightStatus[i]);
        }
    }
}

