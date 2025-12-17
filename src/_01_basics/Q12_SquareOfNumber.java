package _01_basics;

import java.util.Scanner;

// Q12: Take a number as input and print its square
public class Q12_SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square: " + (num * num));
        sc.close();
    }
}
