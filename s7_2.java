import java.util.Scanner;

class s7_2{
  public static void main(String[] args) {
    try {
      System.out.println("before a");
      a();
      System.out.println("after a");
    }
    catch (Exception e) {
      System.out.println(e);
    }
}
    static void a(){
      try{
        System.out.println("before b");
        b();
        System.out.println("after b");
      }
      catch (ArithmeticException ae) {
        System.out.println(ae);
      }
    }
    static void b(){
      try {
        System.out.println("before c");
        c();
        System.out.println("after c");
      }
      catch (ArrayIndexOutOfBoundsException aie) {
        System.out.println(aie);
      }
    }
    static void c(){
      try{
        int a[] = new int[10];
        a[15]=20;
      }
      catch (NumberFormatException nfe) {
        System.out.println(nfe);
      }
    }
  }
