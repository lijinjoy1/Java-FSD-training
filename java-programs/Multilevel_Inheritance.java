

package java_trainingtask2;


class car{
	void display() {
		System.out.println("car brand is invoked");
	}
}

class Bmw extends car{
	void brand() {
		System.out.println("Car brand is BMW");
	}
}

class Benz extends Bmw{
	void Speed() {
		System.out.println("benz car speed is 80km/h");
	}
}

class Multilevel_Inheritance{
	public static void main(String[] args)
	{
		Benz x=new Benz();
		x.display();
		x.brand();
		x.Speed();
	}
}



