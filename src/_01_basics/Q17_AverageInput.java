package _01_basics;

import java.util.Scanner;

// Q17: Take three numbers as input and find their average
public class Q17_AverageInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
        sc.close();
    }
}
