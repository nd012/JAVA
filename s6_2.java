interface p1 {
	void display_1(int a);
}
interface p2 {
	void display_2(int a);
}
interface p extends p1,p2 {
	void display_3(int a);
}
interface p12 extends p {
	void display_4(int a);
}
class s6_2 implements p12 {
	public void display_1(int a) {
		System.out.println("value is "+a);
	}
	public void display_2(int a) {
		System.out.println("value is "+a);
	}
	public void display_3(int a) {
		System.out.println("value is "+a);
	}
	public void display_4(int a) {
		System.out.println("value is "+a);
	}
	public static void main(String[] args) {
		p12 n = new s6_2();
    n.display_1(12);
    n.display_2(003);
    n.display_3(998);
    n.display_4(431);
	}
}
