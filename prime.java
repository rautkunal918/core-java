import java.io.*;
import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int num,i,flag=0 ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        num=sc.nextInt();
        for(i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                flag=flag+1;
            }
        }
        if(flag>0)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}