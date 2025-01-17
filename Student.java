import java.io.*;
import java.util.*;
class Student 
{
    String name;
    int id;
    Scanner sc=new Scanner(System.in);
    void setdata()
    {
        System.out.println("Enter a name");
        name=sc.nextLine();
        System.out.println("Enter a id");
        id=sc.nextInt();
    }
    void display()
    {
        System.out.println("Student name is "+name);
        System.out.println("Id is "+id);
    }
   public static void main(String[] args) 
   {
       int i;
            Student []S=new Student[5];
            for(i=1;i<=5;i++)
            {
                S[i]=new Student();
            }     
            for(i=1;i<=5;i++)
            {
                S[i].setdata();
            }     
            for(i=1;i<=5;i++)
            {
                S[i].display();
            }     
             
   }   
        
}
