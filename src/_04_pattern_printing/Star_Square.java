package _04_pattern_printing;

import java.util.Scanner;
public class Star_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the square pattern:");
        int n = sc.nextInt();
//        int col = sc.nextInt();
        for ( int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= n; j++) { // Loop for printing stars in each row
                System.out.print("*   ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
