package _02_if_else;

// Q10: Check if three sides can form a valid triangle
public class Q10_TriangleValidity {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
