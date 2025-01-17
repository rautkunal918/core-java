import java.io.*;
import java.util.*;
class Sum_E_O 
{
 public static void main(String args[])
 {
     int num,i,sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a range "); //even number( 0,2,4,6,8,10)
     num=sc.nextInt();                       //odd number(1,3,5,7,9)
     if(num%2==0)
     {
         for(i=0;i<=num;i++)
         {
             sum=sum+i;
         }
         System.out.println("Even number sum is "+sum);
     }
     else
     {
         for(i=1;i<=num;i++)
         {
             sum=sum+i;
         }
         System.out.println("Sum of odd number is "+sum);
     }

     
 }   
}















