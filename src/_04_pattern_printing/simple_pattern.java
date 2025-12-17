package _04_pattern_printing;

import java.util.Scanner;

public class simple_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Q1: Print a rectangle pattern of stars
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= col; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // Q2: Print right-angled triangle pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // Q3: Print inverted right-angled triangle
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // Q4: Print number pattern (1 2 3, 1 2 3, ...)
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        
        // Q5: Print increasing number triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        
        // Q6: Print pyramid pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // Q7: Print hollow rectangle
        // int row = 5, col = 7;
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= col; j++) {
        //         if (i == 1 || i == row || j == 1 || j == col) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // Q8: Print diamond pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) System.out.print(" ");
        //     for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 1; i--) {
        //     for (int j = 1; j <= n - i; j++) System.out.print(" ");
        //     for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
        //     System.out.println();
        // }
        
        // Q9: Print alphabet pattern (A B C, A B C, ...)
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     char ch = 'A';
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
        // Q10: Print Floyd's triangle (1, 2 3, 4 5 6, ...)
        // int n = 5;
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
    }
}
