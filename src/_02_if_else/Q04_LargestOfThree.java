package _02_if_else;

// Q4: Find the largest of three numbers
public class Q04_LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        
        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
