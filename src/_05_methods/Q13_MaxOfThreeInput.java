package _05_methods;

import java.util.Scanner;

// Q13: Create a method to find maximum of three numbers from user input
public class Q13_MaxOfThreeInput {
    
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Maximum: " + max(a, b, c));
        sc.close();
    }
}
