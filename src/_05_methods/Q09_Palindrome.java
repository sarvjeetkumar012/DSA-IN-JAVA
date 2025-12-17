package _05_methods;

// Q9: Create a method to check if a number is palindrome
public class Q09_Palindrome {
    
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    
    public static void main(String[] args) {
        System.out.println("Is 121 palindrome? " + isPalindrome(121));
        System.out.println("Is 123 palindrome? " + isPalindrome(123));
    }
}
