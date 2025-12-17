package _02_if_else;

import java.util.Scanner;

// Q14: Take age as input and check voting eligibility
public class Q14_VotingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
