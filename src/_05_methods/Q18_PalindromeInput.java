package _05_methods;

import java.util.Scanner;

// Q18: Create a method to check palindrome from user input
public class Q18_PalindromeInput {
    
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPalindrome(num) ? "a palindrome" : "not a palindrome"));
        sc.close();
    }
}
