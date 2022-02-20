package java_trainingtask5;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		System.out.println("enter the size of your Array = ");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		
		
		System.out.println("enter the elements of your Array = ");
		
		int[] arr1 = new int[size];
		for (int i=0; i<size; i++) {
			
			arr1[i]=sc.nextInt();
		}
		System.out.println("");
		System.out.println("entered elements in the array is = ");
		for(int i=0; i<size; i++) {
			
			System.out.print(arr1[i]+",");
			
		}
		
		
		
		System.out.println("");
		int largest = arr1[0];
				
		for (int j = 0; j < size; j++) {
            if (largest<arr1[j])
            {
            	largest = arr1[j];
                }
            }
		System.out.println("Largest element in the Array is = "+ largest);
}}