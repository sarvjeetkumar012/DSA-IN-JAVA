package _01_basics;

import java.util.Scanner;

// Q18: Take a number and calculate percentage (assume total is 100)
public class Q18_CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        double marks = sc.nextDouble();
        System.out.print("Enter total marks: ");
        double total = sc.nextDouble();
        double percentage = (marks / total) * 100;
        System.out.println("Percentage: " + percentage + "%");
        sc.close();
    }
}
