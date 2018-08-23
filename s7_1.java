import java.util.Scanner;

class s7_1{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int b=0,a=14,c;
    System.out.println("Enter a:");
    a=s.nextInt();
    System.out.println("Enter b:");
    b=s.nextInt();
    try {
      if(b==0){
        throw new Exception("Respected idiot..... 0 shu nakhe 6e ....sarkho answer joto hoi to zero sivai nakh ne");
      }
      else{
        c=a/b;
        System.out.println("Answer is: " + c);
      }
    }
    catch (Exception ne){
      System.out.println("Error " + ne);
    }
 }
}
