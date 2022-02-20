package java_trainingtask8_now;

import java.util.*;
public class Double_Array_List_Descending {

	public static void main(String[] args) {
		
		ArrayList<Double> sample = new ArrayList<Double>();
		sample.add(1.5);
		sample.add(2.5);
		sample.add(3.8);
		sample.add(2.6);
		sample.add(515.966);
		sample.add(3.9);
		
		System.out.println("Elements in the array list is : "+sample);
		System.out.println("---------------------------------------------");
		Collections.sort(sample, Collections.reverseOrder());
		
		System.out.println("Descending order is  : " + sample);
		
	
	
	}}
