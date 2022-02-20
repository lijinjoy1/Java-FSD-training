package java_trainingtask7;

public class trycatch {

	public static void main(String[] args) {
	
		try {
			String str="Hello world";
			
			System.out.println(str.charAt(15));
			}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("try catch exeuted");
	}}
