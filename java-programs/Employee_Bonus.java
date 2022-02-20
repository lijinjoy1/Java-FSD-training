package java_trainingtask4;

import java.util.Scanner;

public class Employee_Bonus {

	public static void main(String[] args) {
		
		int Salary,Year;
		float bonus;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter  your salary = ");
		Salary=sc.nextInt();
		
		System.out.print("Enter your year of service = ");
		Year=sc.nextInt();

		
		
		if(Year>5) {
			bonus=Salary+(Salary)*5/100;
			System.out.println("Yo are upgraded and net bonus amount= "+bonus);
			
		}
		else {
			System.out.println("You are not eligible for bonus");
		}
	}

}
