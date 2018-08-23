import java.util.Scanner;

class InvalidAgeException extends Exception{
  InvalidAgeException(String msg){
    super(msg);
  }
}

class s7_3{
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    int age;
    System.out.println("Enter Age");
    age=s.nextInt();
    try{
      if (age<18) {
        throw new InvalidAgeException("Not eligible..................pela 18 no/ni tha ne pa6i avje run karva");
      }
      else{
        System.out.println("Welcome");
      }
    }
    catch (InvalidAgeException ie) {
      System.out.println(ie);
    }
  }
}
