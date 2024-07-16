package Core_Assignment1;

import java.util.Scanner;

public class Finonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        // Print Fibonacci series
        System.out.println("Fibonacci Series:");
        printFibonacci(numTerms);
    }

    public static void printFibonacci(int numTerms) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm;

        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}