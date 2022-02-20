package java_trainingtask4;
import java.util.Scanner;

public class Attendence_Percentage {

	public static void main(String[] args) {
		
		int a=85;
		System.out.println("The number of classes held was 85 days");
		
		float b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of classes attended = ");
		b=sc.nextFloat();
		
		float percentage;
		percentage=(b/a)*100;
		System.out.println("percentage of class attended is ="+percentage+" "+"%");
		
		if(percentage>75) {
			System.out.println("student is qualified to attend the exam!!");
		}
		else {
			System.out.println("student is not qualified to attend the exam!!");
		}
		
		
		

	}

}
