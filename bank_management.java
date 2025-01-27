import java.io.*;
import java.util.*;
class bank_management
{
    String name,type;
    int ch,acc_no,b,w,d;
    Scanner sc=new Scanner(System.in);
    void accept()
  {
    System.out.println("Enter a name");
    name=sc.nextLine();
    System.out.println("Enter current balance");
    b=sc.nextInt();
    System.out.println("Enter a Account number");
    acc_no=sc.nextInt();
    System.out.println("Enter Account type");
    type=sc.nextLine();
  }
  void display()
  {
      System.out.println("Holder name is"+name);
    System.out.println("1.Diposit money\n 2.Withdraw money\n3.Check mbalance ");
    System.out.println("Enter your choice");
    ch=sc.nextInt();
    if(ch==1)
    {
        System.out.println("Enter money to deposit ");
        d=sc.nextInt();
        b=b+d;
        System.out.println("Money is diposited successfully");
        System.out.println("Current bal;ance is "+b);
    }
    if(ch==2)
    {
        System.out.println("Enter money to withdraw ");
        w=sc.nextInt();
     if(w>b)
      {
       
        System.out.println("Insufficient balance");
      }
      else
     {
         b=b-w;
        System.out.println("Money is withdraw successfully");
        System.out.println("CURRENT BALANCE IS"+b);
     }
    }
    if(ch==3)
    {
        System.out.println("ACCOUNT HOLDER NAME IS "+name);
        System.out.println("Balance is "+b);
    }
else
{
    System.out.println("Invalid choice");
}
  }
  public static void main(String args[])
  {
    bank_management bank=new bank_management();
    bank.accept();
    bank.display();
  }
}