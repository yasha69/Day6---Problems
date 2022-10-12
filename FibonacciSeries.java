package com.bridgelabz.LogicalPrograms;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println("Enter no of terms");
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){              // where i = term
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }

    }
}
