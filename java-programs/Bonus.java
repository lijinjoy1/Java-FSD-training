package java_trainingtask5;

import java.util.Scanner;

public class Bonus {
	public static int Bonus(int salary, int year)
	{
		int bonus=0;
		if(year<=2017 && salary>30000)
		{
			bonus = (salary*22)/100;
		}
		else if(year<=2017 && salary<30000)
		{
			bonus = (salary*33)/100;
		}
		else if(year<=2012)
		{
			bonus = (salary*40)/100;
		}
		else if(year>2017 && salary<30000)
		{
			bonus = (salary*15)/100;
		}
		else if(year>2017 && salary>30000)
		{
			bonus = (salary*10)/100;
		}
		return bonus;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your salary: ");
		int sal = sc.nextInt();
		System.out.println("Enter the year of joining: ");
		int yr = sc.nextInt();
		int result = Bonus(sal,yr);
		
		System.out.println("The Loyality Bonus of "+name+" is "+result);
	}
	

}