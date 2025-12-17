package _05_methods;

import java.util.Scanner;

// Q16: Create a method to print multiplication table from user input
public class Q16_TableInput {
    
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();
    }
}
