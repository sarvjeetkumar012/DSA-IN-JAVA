package _05_methods;

import java.util.Scanner;

// Q11: Create a method to add two numbers from user input
public class Q11_AddInput {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + add(a, b));
        sc.close();
    }
}
