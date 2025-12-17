package _04_pattern_printing;

import java.util.Scanner;
public class number_square {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number you want to print in number square pattern:");
        int n = ns.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }

}
