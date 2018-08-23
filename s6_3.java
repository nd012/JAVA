abstract class Vegetable {
	String color;
  public String toString() {
	 return getClass().getName() +"::"+color;
  }
}
class Potato extends Vegetable {
	Potato() {
		color="Yellow";
	}
}
class Brinjal extends Vegetable {
  Brinjal() {
    color="purple";
  }
}
class Tomato extends Vegetable {
 Tomato() {
  color="Red";
 }
}
class s6_3 {
  public static void main(String args[]) {
   Vegetable veg = new Potato();
   System.out.println(veg);
   veg = new Brinjal();
   System.out.println(veg);
   veg = new Tomato();
   System.out.println(veg);
  }
}
