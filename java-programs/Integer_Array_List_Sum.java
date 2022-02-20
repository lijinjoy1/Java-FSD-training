package java_trainingtask8_now;

import java.util.*;
public class Integer_Array_List_Sum {

	public static void main(String[] args) {
		
		ArrayList<Integer> sample = new ArrayList<Integer>();
		sample.add(2);
		sample.add(8);
		sample.add(10);
		sample.add(20);
		
		System.out.println("Integer array list is ="+sample);
		int sum=0;
		System.out.println("---------------------------------------------");
		
		for(int num : sample) {
			sum += num;
			}
		
		float avg = (float)sum/sample.size();
		System.out.println("Sum of the elements is : "+sum);
		System.out.println("---------------------------------------------");
		System.out.println("Average of the array list elements is :"+ avg);
		
	}}
