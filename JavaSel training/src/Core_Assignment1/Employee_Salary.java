package Core_Assignment1;

import java.util.Scanner;

public class Employee_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter employee's designation (Manager, Developer, Analyst):");
		String designation = scanner.nextLine();;
		
		System.out.println("Enter employee's years of experience:");
		int YearsofExp = scanner.nextInt();
		
		double bonus=calculateBonus(designation, YearsofExp);
		
		System.out.println("The bonus for the employee is: " + bonus);
	}
		
		public static double calculateBonus(String designation, int yearsofExp) {
	        double bonus = 0;
	        
		switch(designation.toLowerCase())
		{
		case "manager":
			if (yearsofExp > 10)
			{
				bonus = 10000;
			}
			else if (yearsofExp > 5)
			{
				bonus = 7000;
			}
			else 
			{
				bonus = 3000;
			}
			break;
			
		case "developer":
			if (yearsofExp > 10)
			{
				bonus = 8000;
			}
			else if (yearsofExp > 5)
			{
				bonus = 5000;
			}
			else 
			{
				bonus = 2500;
			}
			break;
			
		case "analyst":
			if (yearsofExp > 10)
			{
				bonus = 7000;
			}
			else if (yearsofExp > 5)
			{
				bonus = 6000;
			}
			else 
			{
				bonus = 3000;
			}
			break;
			
			default:
				
				System.out.println("Invalid Designation Entered: ");
				break;
		}
		
		return bonus;
		
	}

}
