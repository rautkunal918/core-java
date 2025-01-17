import java.io.*;
import java.util.*;
class Constructor
{
    int a,b,res;
    Scanner sc=new Scanner(System.in);
    Constructor()
    {
        System.out.println("Enter Length and breadth");
        a=sc.nextInt();
        b=sc.nextInt();
        res=a*b;
        System.out.println("Area is "+res);
    }
    public static void main(String args[])
    {
        Constructor C=new Constructor();
    }
}
