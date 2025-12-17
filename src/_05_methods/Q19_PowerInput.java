package _05_methods;

import java.util.Scanner;

// Q19: Create a method to calculate power from user input
public class Q19_PowerInput {
    
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + power(base, exp));
        sc.close();
    }
}
