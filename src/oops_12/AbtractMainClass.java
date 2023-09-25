package oops_12;

// Abstract mainclass to inheritance abstractclass_11 
//  abstract class_11 to inheritance abstract class_12

public class AbtractMainClass extends AbstractClass_11 {

	@Override
	void keypad() {
		// TODO Auto-generated method stub
		System.out.println("new model keypad");
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		AbtractMainClass obj = new AbtractMainClass();
	
		obj.body();
		obj.RAM();
		obj.ROM();
		obj.OS();
		obj.keypad();
	}

	

}
