package _03_loops;

// Q6: Count the number of digits in a number
public class Q06_CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
