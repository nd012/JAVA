import java.util.Scanner;
import java.io.*;
interface Int {
  public void interest(double p,int r,int n);
}

class Simple implements Int{
  public void interest(double p,int r,int n){
    double Answer;
    Answer= (p+r+n)/100;
    System.out.println("Simple interest is: "+ Answer);
  }
}

class Compound implements Int{
  public void interest(double p,int r,int n){
    double ComIn;
    ComIn = p*(Math.pow((1+r),n))-p;
    System.out.println("Compound interest is: "+ ComIn);
  }
}
class s6_1{
  public static void main(String[] args) {
    Int i;
    i = new Simple();
    i.interest(10000,2,3);
    i=new Compound();
    i.interest(3,5,4);
  }
}
