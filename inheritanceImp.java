// Exam Interface
interface Exam {
    int Sports_mark = 20;
}

// Student Class
class Student 
{
    int Roll_no;
    String S_name;
    int m1, m2, m3;

    public Student(int roll_no, String s_name, int m1, int m2, int m3) 
    {
        Roll_no = roll_no;
        S_name = s_name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
     }
}

// Result Class inheriting from Student and implementing Exam
class Result extends Student implements Exam
 {
    public Result(int roll_no, String s_name, int m1, int m2, int m3) 
   {
        super(roll_no, s_name, m1, m2, m3);
    }

    public void display() 
    {
        int totalMarks = m1 + m2 + m3 + Sports_mark;
        System.out.println("Roll Number: " + Roll_no);
        System.out.println("Student Name: " + S_name);
        System.out.println("Total Marks: " + totalMarks);
    }
}
public class inheritanceImp 
{
    public static void main(String[] args) 
   {
        Result studentResult = new Result(40, "RUCHA", 85, 92, 78);
        studentResult.display();
    }
}