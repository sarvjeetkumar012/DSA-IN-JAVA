package _05_methods;

import java.util.Scanner;

// Q17: Create a method to reverse a number from user input
public class Q17_ReverseInput {
    
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number: " + reverse(num));
        sc.close();
    }
}
