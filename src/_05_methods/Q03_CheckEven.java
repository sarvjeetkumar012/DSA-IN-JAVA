package _05_methods;

// Q3: Create a method to check if a number is even
public class Q03_CheckEven {
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 7 even? " + isEven(7));
    }
}
