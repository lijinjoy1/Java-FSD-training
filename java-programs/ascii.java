package java_trainingtasknow;
import java.util.*;
public class ascii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array= ");
		int size= sc.nextInt();
		
		char[] a= new char[size];
		System.out.println("Enter the elements in the array= ");
		
		for(int i=0; i<size; i++) {
			a[i]=sc.next().charAt(0);
			}
		
		for(int i=0; i<size; i++) {
			System.out.println("Entered character is = "+ a[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for(int i=0; i<size; i++) {
			int ascii= a[i];
			
			System.out.println("ASCII value of"+" "+a[i]+" "+"is= "+ascii);
		}
		
		
		
		

	}

}
