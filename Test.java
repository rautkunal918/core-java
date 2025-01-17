import java.io.*;
import java.util.*;
class OverPriceException extends Exception
{
    public OverPriceException()
    {
        System.out.println("Exception Occured...");
    }
    
}
class Test
{
    public static void main(String[] args) 
    {
        String Itemcode,name;
        int price;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter itemname");
            name=sc.nextLine();
            System.out.println("Enter itemcode");
            Itemcode=sc.nextLine();
            System.out.println("Enter item price");
            price=sc.nextInt();
            if(price>999)
            {
                throw new OverPriceException();
            }
            else
            {
                System.out.println("Thanku for Shopping");
            }

            
        }
        catch(OverPriceException e)
        {
          System.out.println("Product is costly"+e);
        }

    }
}
