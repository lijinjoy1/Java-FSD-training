package java_trainingtask2;


class Human{  
		  void eat(){
			  System.out.println("Human is eating");
			  }  
		}  
class Boy extends Human{  
		  void eat(){
			 System.out.println("Boy is eating!!!!");
			 } 

class girl extends Human{  
		void eat(){
				 System.out.println("girl is eating!!!!");
				 } }

class Method_Overridding{
		
	
	public static void main(String[] args) {
		
		
		// creating instance of child class by reference of parent
		Human b = new Boy(); 
		//calling the method with child
	    b.eat(); 

		Human h= new Human();
	    h.eat();
	    
//	    Human a=new girl();
//	    a.eat();
		

	}}

		}
