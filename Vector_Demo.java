import java.io.*;
import java.util.*;
class Vector_Demo
{
 public static void main(String[] args) 
 {
    Vector V=new Vector (5);
    System.out.println("Current Size "+V.size());     
    V.addElement("Kunal");
    V.addElement("34");
    V.addElement("Abc");
    V.addElement("pqr");
    System.out.println("Current size is"+V.size());
    System.out.println("Remove element at "+V.elementAt(3));
    System.out.println("Total capacity is "+V.capacity());
    System.out.println("First element "+V.firstElement());
    System.out.println("Last element"+V.lastElement());
    System.out.println("Elements are "+V);
 }    
}
