import java.util.Scanner;
public class primeNum
{
 public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number :");
   int number = sc.nextInt();
   Boolean isPrime = true ;

      if(number <= 1)
      {
         isPrime = false;
      }
     else
      {
        for(int i =2; i<=number ; i++)
          {
             if(number % i ==0)
               {
                  isPrime = false;
                  break;
               }
         }
      }

     if(isPrime)
      {
        System.out.println(number + " is prime number");
       }
      else
       {
          System.out.println(number + " is not prime number");
       }
    sc.close();

  }
}