package Core_Assignment1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=sc.nextInt();
		int cube = 0,rem;
		int n=number;
		while(n>0) {
			rem=n%10;
			cube+=(rem*rem*rem);
			n=n/10;	
		}
		if(cube==number) {
			System.out.println("no. is armstrong");
		}
		else {
			System.out.println("no. is not armstrong");
		}
		
	}

}
