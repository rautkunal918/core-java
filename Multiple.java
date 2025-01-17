import java.io.*;
import java.util.*;
interface Exam
{
   int SM=20;
   void Sport();
}
class Student
{
    String name;
    int total,m1,m2,m3,roll_no;
    Scanner sc=new Scanner (System.in);
    void accept()
    {
        System.out.println("Enter Student name");
        name=sc.nextLine();
        System.out.println("Enter Student roll no");
        roll_no=sc.nextInt();
        System.out.println("Enter Student marks m1,m2,m3");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt(); 
              
    }
}
class Multiple extends Student implements Exam
{
  public void Sport()
  { 

     total=m1+m2+m3+SM;
  }
  void display()
  {
      System.out.println("Student name is "+name);
      System.out.println("Roll no is "+roll_no);
      System.out.println("Total marks is "+total);
  }
public static void main(String args[])
{
    Multiple M=new Multiple();
    M.accept();
    M.Sport();
    M.display();    
}
} 
