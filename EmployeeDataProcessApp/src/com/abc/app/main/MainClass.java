package com.abc.app.main;

import java.util.List;

import com.abc.app.pojo.Employee;
import com.abc.app.process.EmployeeDataProcess;

public class MainClass {

	public static void main(String[] args) {
	
					
		EmployeeDataProcess empdataProcess = new EmployeeDataProcess();
	
		empdataProcess.addEmployee(new Employee(1, "Ajay", "Dixit", 30000));
		empdataProcess.addEmployee(new Employee(2, "Babar", "Sheikh", 40000));
		empdataProcess.addEmployee(new Employee(3, "Chaitrali", "Waghmare", 50000));
		empdataProcess.addEmployee(new Employee(4, "Dhruv", "Bhanu", 60000));
		empdataProcess.addEmployee(new Employee(5, "Eswari", "Hanodia", 35000));
		empdataProcess.addEmployee(new Employee(6, "Francis", "George", 45000));
		empdataProcess.addEmployee(new Employee(7, "Gaurav", "More", 55000));
		empdataProcess.addEmployee(new Employee(8, "Harmeet", "Devpal", 20000));
		empdataProcess.addEmployee(new Employee(9, "Ishant", "Randive", 5000));
		empdataProcess.addEmployee(new Employee(10, "Jacob", "Dcunha", 70000));
        
    
		System.out.println("Employees with salary between 25000 and 50000:");
        List<Employee> employeesInRange = empdataProcess.getEmployeesWithSalaryInRange(25000, 50000);
        for (Employee employee : employeesInRange) {
            System.out.println(employee);
        }
        
        System.out.println("\nEmployees with first name starting with 'A':");
        List<Employee> employeesWithNameA = empdataProcess.getEmployeesWithFirstNameStartingWith('A');
        for (Employee employee : employeesWithNameA) {
            System.out.println(employee);
        }
        
       
        System.out.println("\nEmployees sorted by salary in ascending order:");
        List<Employee> employeesSortedBySalary = empdataProcess.getEmployeesSortedBySalary();
        for (Employee employee : employeesSortedBySalary) {
            System.out.println(employee);
        }
        
      
    }
}