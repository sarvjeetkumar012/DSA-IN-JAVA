package _02_if_else;

// Q7: Grade system (A >= 90, B >= 80, C >= 70, D >= 60, F < 60)
public class Q07_GradeSystem {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}
