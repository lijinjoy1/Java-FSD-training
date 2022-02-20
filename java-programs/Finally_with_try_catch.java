package java_trainingtask7_now;

public class Finally_with_try_catch {
	public static void main (String[] args)
    {
        int[] arr = {1,2,3,4};
         
        try
        {
            int i = arr[2];
                 
           System.out.println(i);
           System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        finally
        {
            System.out.println("finally block executed");
        }
     
	        System.out.println("Outside of try-catch-finally executed");
    }}