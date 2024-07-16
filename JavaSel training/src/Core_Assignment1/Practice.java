package Core_Assignment1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input integer
      
        int n = scanner.nextInt();
        scanner.close();
        // Checking the conditions and printing the result
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
        
        
    }
}
