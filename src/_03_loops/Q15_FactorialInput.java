package _03_loops;

import java.util.Scanner;

// Q15: Take a number as input and calculate its factorial
public class Q15_FactorialInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
        sc.close();
    }
}
