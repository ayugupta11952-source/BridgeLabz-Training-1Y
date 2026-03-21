package com.gla.array.Level1;

import java.util.Scanner;
public class NumCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (a[i] % 2 == 0)
                    System.out.println(a[i] + " is positive even");
                else
                    System.out.println(a[i] + " is positive odd");
            } else if (a[i] < 0)
                System.out.println(a[i] + " is negative");
            else
                System.out.println(a[i] + " is zero");
        }
        if (a[0] == a[a.length - 1])
            System.out.println("First and last elements are equal");
        else if (a[0] > a[a.length - 1])
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");
    }
}

