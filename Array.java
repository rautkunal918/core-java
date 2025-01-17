//Wrtite a program to perform addition of two 3 x 3 array
import java.io.*;
import java.util.*;
class Array
{
  public static void main(String[] args)
  {
   int a[][]=new int[3][3];
   int b[][]=new int[3][3];
   int c[][]=new int[3][3];
   int i,j;  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first array elements ");
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      a[i][j]=sc.nextInt();
    }
  }
  System.out.println("Enter Second array elements ");
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      b[i][j]=sc.nextInt();
    }
  }
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
    }
  }
  System.out.println("Addition of array element is ");
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
      {
        System.out.println(""+c[i][j]);
      } 
  }
}

}