package oops;

public class Single_Inheritance {

	public static void main(String[] args) {
		
		dell dlap = new dell();
		System.out.println("Dell making parts");
		dlap.display();
		dlap.pannel();
		dlap.battery();
		dlap.windows();
		dlap.additionalsoft();

	}

}

class lap{
	
	public void display() {
		System.out.println(" display");
	}
	
	public void pannel() {
		System.out.println(" pannel");
	}
	
	
	public void battery() {
		System.out.println(" battery");
	}
	
}

class dell extends lap{
	
	public void windows() {
		System.out.println("windows");
	}
	
	public void additionalsoft() {
		System.out.println("chrome");
	}
}
