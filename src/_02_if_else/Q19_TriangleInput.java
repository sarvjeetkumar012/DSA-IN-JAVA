package _02_if_else;

import java.util.Scanner;

// Q19: Take three sides and check if they form a valid triangle
public class Q19_TriangleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
}
