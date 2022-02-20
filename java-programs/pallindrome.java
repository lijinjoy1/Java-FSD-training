package java_trainingtask6;
import java.util.Scanner;

public class pallindrome {
	static boolean pallin(String str) {
		int x=0,y=str.length()-1;
		while(x<y) {
			if (str.charAt(x)!=str.charAt(y)) {
				return false;
			}
			x++;
			y--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of words ");
		int len=sc.nextInt();
		System.out.println("enter the words= ");
		String [] s1= new String[len];
		for(int i=0; i<len; i++) {
			s1[i]=sc.next();
			}
		for(int i=0; i<len; i++) {
			if (pallin(s1[i])) {
				System.out.println(s1[i]+" is a pallindrome");
			}
			else {
				System.out.println(s1[i]+" is not a pallindrome");
			}
		}

	}

}
