// whether a postive number is prime number or not?

package java_trainingtask4;
import java.lang.*;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String args[]) {
		int n;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a positive number= ");
		n=sc.nextInt();
		
		if(n>1) {
			
			for (int i=1;i<=n;i++) {
			
			if(n % i==0) {
				count++;
			}
		}
			if(count==2) {
			System.out.println("prime Number");
		}
			if(count>2)
			{
			System.out.println("not prime Number");
			}
		
		}}}
	


