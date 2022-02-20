package java_trainingtask4;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Positive Number= ");
		num=sc.nextInt();
		
		if(num>=1) {
		
			for (int i=1;i<=10;i++) 
			{ 
			System.out.println(num +" "+ "*"+" "+ i +" "+"="+" "+ num * i);
			}}
		else {
			System.out.println("Invalid Number");
		}
	
	
	}

}
