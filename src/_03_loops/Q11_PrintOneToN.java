package _03_loops;

import java.util.Scanner;

// Q11: Take n as input and print numbers from 1 to n
public class Q11_PrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
