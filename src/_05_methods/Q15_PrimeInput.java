package _05_methods;

import java.util.Scanner;

// Q15: Create a method to check if user input is prime
public class Q15_PrimeInput {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPrime(num) ? "prime" : "not prime"));
        sc.close();
    }
}
