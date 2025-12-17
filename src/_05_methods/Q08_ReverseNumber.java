package _05_methods;

// Q8: Create a method to reverse a number
public class Q08_ReverseNumber {
    
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        System.out.println("Reverse of 123: " + reverse(123));
    }
}
