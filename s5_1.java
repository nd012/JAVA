//1) WAP that creates abstract class figure.Declare area method in this class.Class rectangle //and class circle inherits class figure.
//Write the method in all class that prints area of respective figure. 






abstract class Figure{
	double i,r;
	Figure(double a,double b){
		i=a;
		r=b;
	}
	abstract double area();
}

class Circle extends Figure{
	Circle(double a,double b){
		super(a,b);
	}
	double area(){
		double a=3.14*r*r;
		return a;
		//System.out.println("Area of circle is: "+ a);	
	}	
}
class Rec extends Figure{
	Rec(double a,double b){
		super(a,b);
	}
	double area(){
		double a=i*i;
		return a;
	}
}

class s5_1{
	public static void main(String args[]){
		Figure f;
		f=new Circle(20,15);
		System.out.println("Area of circle is :" + f.area());

		f=new Rec(30,30);
		System.out.println("Area of Rec is :" + f.area());		
	}
}