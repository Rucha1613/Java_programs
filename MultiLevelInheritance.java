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

class C extends B
{ 
  void Son()
   {
       System.out.println("I am Son ");
    }
}

public class MultiLevelInheritance 
{
  public static void main(String args[])
   {
    C obj = new C();

    obj.Grandfather();
    obj.Father();
    obj.Son();
    }
}