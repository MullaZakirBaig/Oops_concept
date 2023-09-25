package oops_12;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over = new Overloading();
		System.out.println("Two Digit : "+over.Add(10, 15));
		System.out.println("Three Digit : "+over.Add(10, 15,10));
		System.out.println("Two Digit : "+over.Add(10.5, 1.5));
		System.out.println("Three Digit : "+over.Add(1.0, 1.5,25.7));
		System.out.println("Three String : "+over.Add("Mulla ","Zakir ","Baig"));

	}

	
	int Add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	
	int Add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	
	double Add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	
	double Add(double a, double b, double c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	String Add(String a, String b, String c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	

}
