package _05_methods;

// Q7: Create a method to print multiplication table
public class Q07_MultiplicationTable {
    
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    public static void main(String[] args) {
        printTable(7);
    }
}
