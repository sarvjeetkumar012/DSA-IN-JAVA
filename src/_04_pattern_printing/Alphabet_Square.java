package _04_pattern_printing;

import java.util.Scanner;
public class Alphabet_Square {
    public static void main(String[] args){
        Scanner As =new Scanner(System.in);
        System.out.print("Enter the number of row you want to print in Alphabet Square pattern: ");
        int n = As.nextInt();
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n ; j++){
                char ch = (char) ('A' + i -1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
