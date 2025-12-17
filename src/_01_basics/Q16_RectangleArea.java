package _01_basics;

import java.util.Scanner;

// Q16: Take length and breadth as input and calculate area of rectangle
public class Q16_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
        sc.close();
    }
}
