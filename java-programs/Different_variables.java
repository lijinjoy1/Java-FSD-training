/* 3.Write a program to show the implemention of local, Instance 
 * and class variables in a single program.*/
package java_training;

public class Different_variables 
{
	int b;  //b is instance variable
	static int data=120;   //data is class variable(static variable)
	

	public static void main(String[] args) 
	{
		int a=100; //a is local variable
		Different_variables obj = new Different_variables();
		
		
		System.out.println("local variable is = "+ a);
		System.out.println("class variable(static varible) is = "+ data);
		System.out.println("instance variable is = "+ obj.b);
	}

}
