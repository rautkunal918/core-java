import java.io.*;
import java.util.*;
class fabonacci 
{
 public static void main(String args[])
 {
     int a=0,b=1,c,num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number ");
     num=sc.nextInt();
     for(int i=1;i<=num;i++)
     {
        System.out.println(a+" ");
         c=a+b;
         a=b;
         b=c;
     }
     

 }   
}
