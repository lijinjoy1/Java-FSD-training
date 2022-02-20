package java_trainingtask7_now;

class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        
        super(str);  
    }  
}  

public class Throw_User_Defined 
{  
    public static void main(String args[]) 
    {  
        try  
        {  
            
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException e)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(e);  
        }
    }  
}  

