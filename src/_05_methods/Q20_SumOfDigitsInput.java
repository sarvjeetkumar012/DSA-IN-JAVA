package _05_methods;

import java.util.Scanner;

// Q20: Create a method to calculate sum of digits from user input
public class Q20_SumOfDigitsInput {
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));
        sc.close();
    }
}
