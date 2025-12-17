package _02_if_else;

// Q9: Check if a number is divisible by 5 and 11
public class Q09_DivisibleByFive {
    public static void main(String[] args) {
        int num = 55;
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5 only");
        } else if (num % 11 == 0) {
            System.out.println("Divisible by 11 only");
        } else {
            System.out.println("Not divisible by 5 or 11");
        }
    }
}
