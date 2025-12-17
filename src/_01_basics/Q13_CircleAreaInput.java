package _01_basics;

import java.util.Scanner;

// Q13: Take radius as input and calculate area of circle
public class Q13_CircleAreaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = 3.14159 * radius * radius;
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}
