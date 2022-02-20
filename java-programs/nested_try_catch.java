package java_trainingtask7;

public class nested_try_catch {

	public static void main(String[] args) {
		try {
			try {
				String str= null;
				System.out.println(str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
	    	
			Float x=Float.parseFloat("31.ac");
			System.out.println(x);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

}}
