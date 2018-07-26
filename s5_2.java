/*2) WAP that illustrate how method can invoke a super class method.
 There is one supercalss A. class B extends class A and class C extends class B. 
 Each of these classes define a getdescription() method that returns a string.   
 That string includes description of the class plus description of each super class. Inherits  each of these class and invoke the gerdescription() method.*/

import java.util.Scanner;

class A
{  
    void get_desc()
    {
        Scanner s = new Scanner(System.in);
        String Name;
        System.out.println("enter your Name");
        Name = s.nextLine();        
    }
}
class B extends A
{
    void get_desc()
    {
	super.get_desc();       
        Scanner s = new Scanner(System.in);
        String SurName;
        System.out.println("enter your SurName");
        SurName = s.nextLine();
    }
}
class C extends B
{
    void get_desc()
    {
super.get_desc();
    Scanner s = new Scanner(System.in);
    String college;
    System.out.println("enter college Name");
    college = s.nextLine();
    }
    
}
class s5_2{

    public static void main(String[] args) {
        C obj = new C();
        obj.get_desc();
      }
}