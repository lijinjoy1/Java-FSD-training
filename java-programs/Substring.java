/*1.Write a program to take take two strings as an input from the user and check
if the second one is a substring of the first.*/

package java_trainingtask6;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string= ");
		String S1 = sc.nextLine();
		
		System.out.println("Enter the second string= ");
		String S2 = sc.nextLine();
		
		System.out.println("----------------------------------");
		int res= S1.indexOf(S2);
		if(res!=-1) {
			System.out.println(S2+" is present and it is a substring");
		}
		else {
			System.out.println(S2+" is not a substring");
		}
		

	

	}}


