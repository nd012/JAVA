import java.util.Scanner;

class s_4{
      public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int count=0 , i=0;
      System.out.println("Enter a String");
      String str = s.nextLine();
      String rev = "";
      int n = str.length();
      n--;
      for (i=n;i>=0;i--) {
         rev = rev + str.charAt(i);
      }
      System.out.println("String is: "+rev);
      if(!rev.equals(str)){
        System.out.println("Not Palindrom");
      }
      else {
        System.out.println("Pallindrom");
      }
    }
}
