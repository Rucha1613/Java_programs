import java.util.Scanner;
public class ReverseNumber
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    int  number = sc.nextInt();
    int reverseNumber = 0;
   
    while(number != 0)
     {
    int digit = number%10;
    reverseNumber = reverseNumber *10 + digit;
    number /= 10 ;
    }
  System.out.println("Reverse number :" + reverseNumber );
   sc.close();

 }
}
