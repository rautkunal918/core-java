import java.io.*;
import java.util.*;
class Even_num_f_array
{
    public static void main(String[] args) 
    {
      int []array;
      array=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a array");
      for(int i=0;i<5;i++)
      {
        array[i]=sc.nextInt();
      } 
      System.out.println("Even number is"); 
      for(int i=0;i<5;i++)  
    { 
      if(array[i]%2==0)
      {
          System.out.println(array[i]);
      }
    }
    }
}