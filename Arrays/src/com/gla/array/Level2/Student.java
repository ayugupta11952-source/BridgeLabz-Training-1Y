package com.gla.array.Level2;

import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        double phy[]=new double[n];
        double chem[]=new double[n];
        double math[]=new double[n];
        double percentage[]=new double[n];
        char grade[]=new char[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Physics Chemistry Maths marks of student "+(i+1)+":");
            phy[i]=sc.nextDouble();
            chem[i]=sc.nextDouble();
            math[i]=sc.nextDouble();
            if(phy[i]<0||chem[i]<0||math[i]<0){
                System.out.println("Enter positive marks");
                i--;
            }
        }
        for(int i=0;i<n;i++){
            percentage[i]=(phy[i]+chem[i]+math[i])/3.0;
            if(percentage[i]>=80)
                grade[i]='A';
            else if(percentage[i]>=70)
                grade[i]='B';
            else if(percentage[i]>=60)
                grade[i]='C';
            else if(percentage[i]>=50)
                grade[i]='D';
            else if(percentage[i]>=40)
                grade[i]='E';
            else
                grade[i]='R';
        }
        System.out.println("Phy Chem Math % Grade");
        for(int i=0;i<n;i++){
            System.out.println(phy[i]+" "+chem[i]+" "+math[i]+" "+percentage[i]+" "+grade[i]);
        }
    }
}
