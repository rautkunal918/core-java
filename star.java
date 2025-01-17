import java.io.*;
import java.util.*;
class star 
{
 public static void main(String[] args)
 {
   int num,i,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enater a number");
   num=sc.nextInt();
   for(i=0;i<num;i++)
   {
     for(j=0;j<=i;j++)
     {
        System.out.print("*");
     } 
   }
   System.out.println();   
 }   
}
