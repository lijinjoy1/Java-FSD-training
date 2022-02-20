// Program for LOgical AND operator

package java_trainingtask3;

public class Logical_AND {
	

	 public static void main(String[] args)
	    {
	      
	        int a = 10, b = 50, c = 20, d = 0;
	  
	     
	        System.out.println("First Number is  " + a);
	        System.out.println("Second Number is   = " + b);
	        System.out.println("Third Number is   = " + c);
	  
	       
	        if ((a < b) && (b > c)) {
	            d = a + b + c;
	            System.out.println("Logical AND satisfied and The sum is: " + d);
	        }
	        else
	        	
	        	System.out.println("False conditions");
    }
	}