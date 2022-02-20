// Ternary operator and find the greatest of three numbers.

package java_trainingtask3;

public class Ternary_1 {

	public static void main(String[] args) {
		int a=80,b=100,c=75;
		
		int result= (a>b) ? (a>c?a:c): (b>c?b:c);
		
		System.out.println("Largest of three number is : "+result);

	}

}
