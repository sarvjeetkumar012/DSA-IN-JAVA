package _05_methods;

// Q2: Create a method to add two numbers
public class Q02_AddTwoNumbers {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }
}
