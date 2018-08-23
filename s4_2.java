import java.util.Scanner;

class Box{
  double height,width,length;

  Box(){
    width=10;
    height=20;
    length=30;
  }

  Box(double width, double height, double length){
    this.width=width;
    this.height=height;
    this.length=length;
  }

  double area(){
    return width*height*length;
  }
}

class s4_2{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Box b1 = new Box();
    Box b2 = new Box(14,15,16);
    double a1,a2;
    a1 = b1.area();
    a2 = b2.area();
    System.out.println("Area of Box 1 is " + a1 + "And area of box 2 is" + a2);
  }
}
