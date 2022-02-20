package java_trainingtask2;
// Abstract Class program


abstract class Car{
	
	
	abstract void start(); 
	abstract void speed(); 
}


class altocar extends Car{
	void start() {
		System.out.println("car started");
	}
	void speed() {
		System.out.println("car speed");
	}
}

class nanocar extends Car{
void start() {
	System.out.println("car started and runs at 60km/h");
	}
	void speed() {
		System.out.println("car speed increased");
	}
}

 
public class AbstractClass {

	
	public static void main(String[] args) {
		Car c=new altocar();
		c.start();
		c.speed();
		
		Car a= new nanocar();
		a.start();
		a.speed();
		
		
		

	}

}


