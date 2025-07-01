import java.util.Vector;
public class VectoeDemo
{
  public static void main(String args[])
  {
    Vector<Integer> vec = new Vector< >() ;
     
    vec.add(5);
    vec.add(15);
    vec.add(25);
    vec.add(35);
    vec.add(45);

    System.out.println("Original Vector :" + vec);

    vec.add(1,10);
    System.out.println("after inserting 10 to the Second position :" + vec);

   vec.remove(0);
   System.out.println("vector after removing the first position element :" + vec); 

   vec.remove(3);
   System.out.println("vector after removing the fourth position element :" + vec); 

   }
}