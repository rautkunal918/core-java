import java.io.*;
import java.util.*;
class Passbook
{
    String name,bank_name,add;
    int acc_no;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter bank name");
        bank_name=sc.nextLine();
        System.out.println("Enter bank address");
        add=sc.nextLine();   
 
    }
}
class customer extends Passbook
{
    void input()
    {
        System.out.println("Enter Account number");
        acc_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer name");
        name=sc.nextLine();
    }

}
class Multilevel extends customer
{
    void display()
    {
        System.out.println("Bank name is "+bank_name);
        System.out.println("Bank address is "+add);
        System.out.println("Account number is"+acc_no);
        System.out.println("Customer name is"+name);
    }
    public static void main(String args[])
{
  Multilevel M=new Multilevel();
  M.getdata();
  M.input();
  M.display();
} 
}
