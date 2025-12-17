package _01_basics;

import java.util.Scanner;

// Q11: Take two numbers as input and print their sum
public class Q11_AddUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        sc.close();
    }
}
