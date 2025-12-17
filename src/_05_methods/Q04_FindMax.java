package _05_methods;

// Q4: Create a method to find maximum of two numbers
public class Q04_FindMax {
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static void main(String[] args) {
        System.out.println("Max: " + max(15, 20));
    }
}
