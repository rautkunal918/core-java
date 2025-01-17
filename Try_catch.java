import java.io.*;
import java.util.*;
class Try_catch
{
 public static void main(String args[])
 {
    int a,b,res; 
    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.println("Enter a number ");
        a=sc.nextInt();
        b=sc.nextInt();
        res=a/b;
        System.out.println("Division is "+res);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Cannot divide by zero");
    }
 }
}