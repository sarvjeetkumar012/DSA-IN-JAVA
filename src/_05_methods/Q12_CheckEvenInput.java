package _05_methods;

import java.util.Scanner;

// Q12: Create a method to check if user input number is even
public class Q12_CheckEvenInput {
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isEven(num) ? "even" : "odd"));
        sc.close();
    }
}
