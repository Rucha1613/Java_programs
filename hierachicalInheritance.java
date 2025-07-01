class A
{ 
  void Grandfather()
   {
       System.out.println("I am Grandfather ");
    }
}

class B extends A
{ 
  void Father()
   {
       System.out.println("I am father ");
    }
}

class C extends A
{ 
  void Son()
   {
       System.out.println("I am Son ");
    }
}

public class hierachicalInheritance 
{
  public static void main(String args[])
   {

    B obj1 = new B();

    obj1.Grandfather();
    obj1.Father();


    C obj2 = new C();

    obj2.Grandfather();
    obj2.Son();
    }
}