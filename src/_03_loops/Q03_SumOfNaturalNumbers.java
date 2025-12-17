package _03_loops;

// Q3: Find the sum of first N natural numbers
public class Q03_SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
