package java_trainingtask5;

import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array= ");
		int size = sc.nextInt();
		
		String[] arr1 = new String[size];
		System.out.println("Enter the elements for array= "); 
		for(int i=0;i<size;i++)
		{
			arr1[i] = sc.next();
		}
		
		System.out.println("Entered array elements are= ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+",");
		}
		
	
		String[] arr2 = new String[size];
		for(int i=0;i<size;i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println("");
		
		System.out.println("Reverse order is: "); 
		for(int i=size-1; i>=0; i--)
		{
			System.out.println(arr2[i]);
		}
	
	}}
