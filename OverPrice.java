import java.io.*;
import java.util.*;
OverPriceException extends Exception
{
    public OverPriceException()
    {
      System.out.println("Exception occured");
    }
}
class OverPrice
{
    public static void main(String args[])
    {
      int bal;
      Scanner sc=new Scanner (System.in);
      try
      {
          System.out.println("Enter balance");
          bal=sc.nextInt();
          if(bal>1000)
          {
              throw new OverPriceException();
          }
          else
          {
              System.out.println("Balance is"+bal);
          }

      }   
      catch(OverPriceException e)
      {
          System.out.println("Balance is less than 1000"+e);
      } 

    }
    
}