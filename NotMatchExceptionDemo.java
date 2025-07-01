// Define a custom exception
class NotMatchException extends Exception
 {
    public NotMatchException(String message) 
      {
        super(message);
      }
}

public class NotMatchExceptionDemo 
{
    public static void checkCountry(String country) throws NotMatchException 
         {
             if (!country.equals("India")) 
                {
                     throw new NotMatchException("Country is not India");
                 }
             else
               {
                 System.out.println("Country is India");
               }
         }

    public static void main(String[] args) {
        try 
         {
            checkCountry("India");
        } 
        catch (NotMatchException e) 
         {
            System.out.println(e.getMessage()); // Output: Country is not India
        }
    }
}