class A
{ 
  void show()
   {
       System.out.println("Class A");
    }
}

class B extends A
{ 
  void show()
   {
       super.show();
       System.out.println("Class B ");
    }
}

public class SuperKeyword
{
  public static void main(String args[])
   {
     B obj = new B();

     obj.show();
         }
 
}