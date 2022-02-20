package java_trainingtask5;

import java.util.Scanner;
public class Duplicate_Elements {

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
		System.out.println("Duplicate elements in the Array is = ");
		
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				
				if (arr1[i]==arr1[j]) {
					System.out.print(arr1[j]+",");
				}
			}
		}
	}
	
}
