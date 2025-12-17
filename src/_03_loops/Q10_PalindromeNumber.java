package _03_loops;

// Q10: Check if a number is palindrome
public class Q10_PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
