public class Employee
{
  int empID;
  String name;
  int salary;
  Employee(int empID,String name, int salary )
  {
    this.empID =empID ;
    this. name =name ;
    this.salary =salary;
  }
   void display()
   {
     System.out.println("Employee_ID : " + empID + "  , Employee_Name :" +name + " , Employee_Salary :" + salary);
    }
  public static void main(String args[])
  {
   Employee e1 = new Employee(12,"Rema",15000);
   Employee e2 = new Employee(13,"Rama",35000);
   Employee e3 = new Employee(14,"Sima",80000);

   e1.display();
   e2.display();
   e3.display();
   } 
}

