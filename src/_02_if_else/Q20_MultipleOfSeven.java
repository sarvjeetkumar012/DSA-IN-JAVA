package _02_if_else;

import java.util.Scanner;

// Q20: Take a number and check if it's a multiple of 7
public class Q20_MultipleOfSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 7 == 0) {
            System.out.println(num + " is a multiple of 7");
        } else {
            System.out.println(num + " is not a multiple of 7");
        }
        sc.close();
    }
}
