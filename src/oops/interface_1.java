package oops;

interface Animal{
	public void eat();
}

interface Dog {
	public void sleep();
}

public class interface_1 implements Animal,Dog{
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleeping");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating ...");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_1 d = new interface_1();
		d.eat();
		d.sleep();
		
	}

	
}
