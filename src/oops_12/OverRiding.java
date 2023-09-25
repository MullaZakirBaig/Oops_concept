package oops_12;

public class OverRiding extends add {
	
	public void Add(int a,int b) {
		int c = a+b;
		System.out.println("method of two digit "+c);
		super.Add(20, 30);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding o = new OverRiding();
		o.Add(10, 20);
		
	}

}
class add{
	// method two digit
	public void Add(int a,int b) {
		int c = a+b;
		System.out.println("method of two digit "+c);
	}
}