//* General Association: Employee and Company

//? Problem : Create a Company class and an Employee class. A company can have many employees. Write a program to add employees to a company and display their details.

import java.util.ArrayList;

class Employee{
	String name;
	String designation;

	public Employee(String name, String designation){
		this.name = name;
		this.designation = designation;
	}
	public void displayInfo(){
		System.out.println("Employee" + name + ", Designation:" + designation);
	}
}

class Company {
	String companyName;
	ArrayList<Employee> employees = new ArrayList<>();
	public Company(String companyName){
		this.companyName = companyName;
	}

	public void addEmployee(Employee employee){
		employees.add(employee);
	}

	public void displayEmployess(){
		System.out.println("Company" + companyName);
		for (Employee e : employees){
			e.displayInfo();
		}
	}
}

public class AssociationExample {
	public static void main(String []args){
		Company company = new Company("EduCode");
		Employee emp1 = new Employee("Hasan","Founder & CEO");
		Employee emp2 = new Employee("Sajid","CTO");
	}
}