package Core_Assignment1;

import java.util.Scanner;
 
public class Factorial {
 
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =  scn.nextInt();
		
		int factorial=1;
		
		for(int i=1; i<=num; i++) {  //num=3;
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of "+num+" is "+factorial);
		
 
	}
 
}