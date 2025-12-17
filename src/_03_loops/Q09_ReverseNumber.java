package _03_loops;

// Q9: Reverse a number
public class Q09_ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
