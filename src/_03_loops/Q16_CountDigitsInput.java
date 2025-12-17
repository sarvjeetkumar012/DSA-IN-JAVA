package _03_loops;

import java.util.Scanner;

// Q16: Take a number as input and count its digits
public class Q16_CountDigitsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
