import java.util.Scanner;

class s_2{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int wcount=0 , vcount=0 , ccount=0 , scount=0 , cpcount=0;
    System.out.println("Enter a String");
    String str = s.nextLine();
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        vcount++;
      }
      else if ( str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
        vcount++;
      }
      else {
        ccount++;
      }
      if (str.charAt(i)==' '){
        scount++;
      }
      if((str.charAt(i)==' ') && (str.charAt(i+1)>='A') && (str.charAt(i+1)<='z')) {
        wcount++;
      }
      if((str.charAt(i)>='A') && (str.charAt(i)<='Z')) {
        cpcount++;
      }
    }
    wcount++;
    System.out.println("Vowels are " + vcount);
    System.out.println("Consonants are " + ccount);
    System.out.println("Spaces are "+ scount);
    System.out.println("Words are "+ wcount);
    System.out.println("Capital Letters are " + cpcount);
  }
}
