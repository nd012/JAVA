import java.util.Scanner;

class s_3{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = " Hello My name Is Nand Gondha and i am testing this program";
    int count=0 , i=0;
    //System.out.println("Enter a String");
    //String str = s.nextLine();
    int n = str.length();
    n--;
    for (i=1;i<=n;i++) {
      if((str.charAt(i)==' ') && (str.charAt(i+1)>='A')) {
        count++;
      }
    }
    count++;
    System.out.println("Words is " + count);
  }
}
