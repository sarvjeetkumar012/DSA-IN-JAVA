package _02_if_else;

import java.util.Scanner;

// Q12: Take a number as input and check if it's even or odd
public class Q12_EvenOddInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
