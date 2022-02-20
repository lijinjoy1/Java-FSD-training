// Program for LOgical OR operator
package java_trainingtask3;

public class Logical_OR {

	public static void main(String[] args)
    {
       
        int a = 20, b = 10, c = 30, d = 0;
  
     
        System.out.println("First Number is  = " + a);
        System.out.println("Second Number is  = " + b);
        System.out.println("Third Number is  = " + c);
        
        if (a > b || b < c) {
        	d=a+b+c;
            
        	System.out.println("One or both conditions are true and the sum is ="+d);}
        else {
            System.out.println("Both the conditions are false");}
   }
}