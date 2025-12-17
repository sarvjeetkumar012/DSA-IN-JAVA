package _02_if_else;

import java.util.Scanner;

// Q18: Take a number and check if it's divisible by 3 and 5
public class Q18_DivisibilityInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3 only");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5 only");
        } else {
            System.out.println("Not divisible by 3 or 5");
        }
        sc.close();
    }
}
