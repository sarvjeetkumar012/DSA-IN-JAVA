package _02_if_else;

// Q1: Check if a number is positive, negative, or zero
public class Q01_PositiveNegative {
    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
