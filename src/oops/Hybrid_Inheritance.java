package oops;

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sup2 obj = new sup2();
		obj.sup_2();
		obj.sub_1();
		obj.sup_1();
		System.out.println();
		sub1 obj1 = new sub1();
		obj1.sup_1();
		obj1.sub_1();
	}

}
class sup1 {
	
	public void sup_1() {
		System.out.println("sup1 class");
	}
}
class sub1 extends sup1{
	
	public void sub_1() {
		System.out.println("sub1 class");
	}
}
class sub2 extends sup1 {
	
	public void sub_2() {
		System.out.println("sub2 class");
	}
	
}
class sup2 extends sub1{
	public void sup_2() {
		System.out.println("sup2 class");
	}
	
}