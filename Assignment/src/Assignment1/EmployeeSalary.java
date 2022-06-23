package Assignment1;
import java.util.Scanner;
public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the salary");
		float salary = in.nextFloat();
		float tSalary;
		
		if(salary>1000000) {
			float tax = salary*0.3f;
			tSalary = salary-tax;
		}
		else if(salary>500000) {
			float tax = salary*0.2f;
			tSalary = salary-tax;
		}
		else {
			float tax = salary*0.05f;
			tSalary = salary-tax;
		}
		
		System.out.println("Total Salary "+tSalary);
	}
}
