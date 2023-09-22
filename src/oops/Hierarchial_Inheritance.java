package oops;



public class Hierarchial_Inheritance {

	public static void main(String[] args) {
		Dell_lop obj = new Dell_lop();
		obj.method_aa();
		obj.method_bb();
		
		System.out.println();
		Lenova_lop obj1 = new Lenova_lop();
		
		obj1.method_aa();
		obj1.method_cc();

	}

}
//parents class or Super class
class Windows10{  
	void method_aa() {
		System.out.println("I am  windows10 OS");
	}
}
//chaild1 class or sub1 class
class Dell_lop extends Windows10{
	void method_bb() {
		System.out.println("Dell_lop "+"I am using windows10 OS");
	}
}
//chaild2 class or sub2 class
class Lenova_lop extends Windows10{
	void method_cc() {
		System.out.println("Lenova_lop "+"I am using windows10 OS");
	}
}