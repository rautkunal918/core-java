import java.io.*;
import java.util.*;
interface Salary
{
    int basic_salary=5000;
    void basic_sal();
}
class Employee
{
    String name;
    int age;
    Scanner sc=new Scanner(System.in);
    void Display()
 {
    System.out.println("Enter a name");
    name=sc.nextLine();
    System.out.println("Enter age");
    age=sc.nextInt();
 }
}
class gross_sal extends Employee implements Salary
{
   int TA,DA,total,HRA;
   public void basic_sal()
   {
    total=basic_salary+TA+DA+HRA;
   } 
}