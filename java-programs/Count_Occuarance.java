package java_trainingtask5;

import java.util.Scanner;

public class Count_Occuarance {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array= ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the  array: "); 
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		System.out.println("entered elements in the array is = ");
		for (int i=0; i<size; i++) {
			System.out.print(arr[i]+",");
			}
		System.out.println("");
		
		System.out.println("Enter a n umber to check occuarance: ");
		int x = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(x== arr[i])
			{
				count++;
			}
		}
		System.out.println("Number of occuarance:" +count);
		
	
	
	}}
