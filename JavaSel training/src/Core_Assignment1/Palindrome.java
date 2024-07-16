package Core_Assignment1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		sc.close();
		
		if (isPalindrome(number)) {
			System.out.println(number + "is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome.");
			}
		}
		
		public static boolean isPalindrome(int number) {
			int originalnumber = number;
			int reversedNumber = 0;
			
			
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return originalnumber == reversedNumber;
	    }
	}