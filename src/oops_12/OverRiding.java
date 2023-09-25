package oops_12;

public class OverRiding extends add {

	public void Add(int a, int b) {
		int c = a + b;
		System.out.println("method of two digit " + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding o = new OverRiding();
		add o1 = new OverRiding();
		o.Add(10, 20);
		o1.Add(20, 40);

	}

}

class add {
	// method two digit
	public void Add(int a, int b) {
		int c = a + b;
		System.out.println("method of two digit " + c);
	}
}