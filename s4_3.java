import java.util.Scanner;
class Method{
  double area(double l, double b){
    System.out.println("Rectangle area is "+ l*b);
    return l*b;
  }
  double area(double l){
    System.out.println("Area of sqare is " + l*l);
    return l*l;
  }
  double area(double l,double h, double b){
   System.out.println("Area of Triangle is" + (0.5*l*h) );
   return (0.5*l*h);
 }
}

class s4_3{
  public static void main(String[] args) {
    Method m = new Method();
    double l=10,h=15,b=20;
    double a = m.area(l,b);
    double a1 = m.area(l);
    double a2 = m.area(l,h,b);
  }
}
