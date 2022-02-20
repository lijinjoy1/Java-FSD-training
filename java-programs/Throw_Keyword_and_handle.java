package java_trainingtask7_now;

public class Throw_Keyword_and_handle {

	 public static void exam(int mark) {  
	        
		 if(mark>80) {  
			  System.out.println("Student is passed"); 
	              
	        }  
	        else {  
	           
	        	throw new ArithmeticException("Student is not passed!!");
	        }  
	    }  
	    
	    
	 public static void main(String args[]){  
	       
		 	exam(90);  
	        
		 	System.out.println("rest of the code executed!!!...");    
	  }    
	}    

    
