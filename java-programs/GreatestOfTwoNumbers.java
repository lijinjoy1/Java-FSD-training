/*2.Write a Java Program to initalise two global static variables and 
 * to display the greatest of them. */
package java_training;
import java.util.Scanner;

public class GreatestOfTwoNumbers
{
	static int i=10;
	static int j=5;

	public static void main(String[] args) 
	{
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		if(i>j) {
			System.out.println("i is the greatest number ");

	}
		else {
			System.out.println("j is the greatest number ");
		}

	}}
