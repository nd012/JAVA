import java.util.Scanner;
class Salary{
  double Gross(double b,double D,double H){
    return (b+D+H);
  }
  double Net(double G,double C,double P1,double P2){
    return (G-C-P1-P2);
  }
}
class s4_1{
  public static void main(String[] args) {
    Salary sa = new Salary();
    Scanner s = new Scanner(System.in);
    int EmpNo;
    double netS,grossS,CCA=240,PT=100,basic;
    String EmpName = new String();
    System.out.println("Enter Employee Name:");
    EmpName = s.next();
    System.out.println("Enter Employee Number");
    EmpNo = s.nextInt();
    System.out.println("Enter the Basic");
    basic = s.nextDouble();
    double DA = (0.5*basic);
    double HRA = (0.25*basic);
    double PF = (10/100*basic);
    grossS = sa.Gross(basic,DA,HRA);
    netS = sa.Net(grossS,CCA,PF,PT);

    System.out.println("Gross salary of employee " + EmpName + " is " + grossS + " And net salary is "+ netS);
  }
}
