package _05_methods;

import java.util.Scanner;

// Q14: Create a method to calculate factorial from user input
public class Q14_FactorialInput {
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));
        sc.close();
    }
}
