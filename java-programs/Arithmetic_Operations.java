/*1.Write a Java Program to initalise two variables 
and perform all the Arithmetic operations on them and dsiplay their result*/

 package java_training;

import java.util.Scanner;
import java.io.*;

class Arithmetic_Operations 
{

	public static void main(String[] args)
	{
		float first_number,second_number,sum,sub,mul,div;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number =");
		first_number=sc.nextInt();
		System.out.println("Enter the second number =");
		second_number=sc.nextInt();
		
		sum=first_number+second_number;
		System.out.println("The result of addition is = "+sum);
		
		sub=first_number-second_number;
		System.out.println("The result of sub is = "+sub);
		
		mul=first_number*second_number;
		System.out.println("The result of multiplication is = "+mul);
		
		div=first_number/second_number;
		System.out.println("The result of division is = "+div);
		
		
		
		
		
		
		

	}

}
