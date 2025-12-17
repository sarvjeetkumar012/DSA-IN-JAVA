package _05_methods;

// Q10: Create a method to calculate power (a^b)
public class Q10_Power {
    
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("3^4 = " + power(3, 4));
    }
}
