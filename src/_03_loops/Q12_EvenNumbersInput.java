package _03_loops;

import java.util.Scanner;

// Q12: Take n as input and print even numbers from 1 to n
public class Q12_EvenNumbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
