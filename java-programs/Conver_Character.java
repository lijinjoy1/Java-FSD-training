/*3.Write a program to take input of a String and convert it into a character array and reverse the array,
and to again make that reversed character array as a String and display it. */

package java_trainingtask6;
import java.util.Scanner;
public class Conver_Character {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string= ");
		String s1= sc.nextLine();
		
		char [] c= s1.toCharArray();
		System.out.println("Character Array is = ");

		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+",");
		}
		
		System.out.println("");
		System.out.println("----------------------------------------");
	
		System.out.println("Reversed array is = ");
		for(int i=c.length-1; i>=0; i-- ) {
			System.out.print(c[i]+",");
		}
		
		char ch;
		String rev="";
		for(int i=0; i<s1.length(); i++) {
			ch=s1.charAt(i);
			rev=ch+rev;
		}
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("Reversed character array to String is = "+rev);
	}}
