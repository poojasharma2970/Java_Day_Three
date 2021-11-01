package HandsOn;
import java.util.Scanner;

public class EmployeeAbstract {

	public static void main(String[] args) {
//		 Create an abstract class Employee having abstract methods Salary, Loan, Allowance.
//		 Implement that method in the sub classes (Manager, Designer and Developer).
		

	}

}

abstract class Employee{
	abstract void  Salary();
	abstract void Loan();
	abstract void Allowance();
}

class Manager extends Employee{
	int sal;
	void Salary() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		sal = s.nextInt();
	}
	
	void Loan() {
		double c;
		c = 0.2*sal;
		System.out.println("The Loan Amount is : ");
	}
	
	void Allowance() {
		
	}
}