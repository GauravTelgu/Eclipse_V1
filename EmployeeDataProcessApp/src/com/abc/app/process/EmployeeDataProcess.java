package com.abc.app.process;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import com.abc.app.pojo.Employee;

public class EmployeeDataProcess {

	 private List<Employee> employees;

	    public EmployeeDataProcess() {
	        employees = new ArrayList<>();
	    }

	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	    }
	    
	    public List<Employee> getEmployeesWithSalaryInRange(double minSalary, double maxSalary) {
	        List<Employee> result = new ArrayList<>();
	        for (Employee employee : employees) {
	            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
	                result.add(employee);
	            }
	        }
	        return result;
	    }

	    public List<Employee> getEmployeesWithFirstNameStartingWith(char letter) {
	        List<Employee> result = new ArrayList<>();
	        for (Employee employee : employees) {
	            if (employee.getFirstName().startsWith(String.valueOf(letter))) {
	                result.add(employee);
	            }
	        }
	        return result;
	    }

	    public List<Employee> getEmployeesSortedBySalary() {
	        List<Employee> sortedEmployees = new ArrayList<>(employees);
	        sortedEmployees.sort((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()));
	        return sortedEmployees;
	    }
	        public List<Employee> ascorderbyname() {
		        List<Employee> Collections = new ArrayList<>(employees);
		        Collections.sort((emp1, emp2) -> (emp1.getFirstName()).compareTo(emp2.getFirstName()));
		        return Collections;
	    }
	}
