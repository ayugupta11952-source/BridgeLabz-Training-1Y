package com.gla.array.Level2;

import java.util.*;
public class Student2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        double marks[][]=new double[n][3];
        double percentage[]=new double[n];
        char grade[]=new char[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Physics Chemistry Maths marks of student "+(i+1)+":");
            marks[i][0]=sc.nextDouble();
            marks[i][1]=sc.nextDouble();
            marks[i][2]=sc.nextDouble();
            if(marks[i][0]<0||marks[i][1]<0||marks[i][2]<0){
                System.out.println("Enter positive marks");
                i--;
            }
        }
        for(int i=0;i<n;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if(percentage[i]>=80)grade[i]='A';
            else if(percentage[i]>=70)grade[i]='B';
            else if(percentage[i]>=60)grade[i]='C';
            else if(percentage[i]>=50)grade[i]='D';
            else if(percentage[i]>=40)grade[i]='E';
            else grade[i]='R';
        }
        System.out.println("Phy Chem Math % Grade");
        for(int i=0;i<n;i++){
            System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]+" "+percentage[i]+" "+grade[i]);
        }
    }
}
