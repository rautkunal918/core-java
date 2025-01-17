import java.io.*;
import java.util.*;
class circle
{ 
  public static void main(String args[])
  { 
    float p=3.14f,r,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius :-");
	r=sc.nextFloat();
	System.out.println("radius ="+r);
	System.out.println("Pi="+p);
    area=p*r*r;
    System.out.println("Area of circle ="+area);
  
  }
}