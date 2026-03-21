package com.gla.array.Level1;

import java.util.*;
public class TwodToOned{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter columns:");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("Enter elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int array[]=new int[rows*cols];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[index]=matrix[i][j];
                index++;
            }
        }
        System.out.println("1D array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
