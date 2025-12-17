package _03_loops;

// Q5: Calculate factorial of a number
public class Q05_Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
