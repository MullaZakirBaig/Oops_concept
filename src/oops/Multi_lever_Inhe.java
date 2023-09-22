package oops;

public class Multi_lever_Inhe {

	public static void main(String[] args) {
	//Multilevel Inheretance calling a all class d create object
		D d = new D();
		d.a();
		d.b();
		d.c();
		d.d();

	}

}
class A{
	public void a() {
		System.out.println("class A");
	}
}
class B extends A{
	public void b() {
		System.out.println("class B");
	}
}
class C extends B{
	public void c() {
		System.out.println("class C");
	}
}
class D extends C{
	public void d() {
		System.out.println("class D");
	}
}