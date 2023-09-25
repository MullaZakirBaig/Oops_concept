package oops_12;

public class MainClass implements Class_1,Class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m = new MainClass();
		m.Circle_Area();
		System.out.println();
		m.Rec_Area();
		System.out.println();
		m.cylinder_Vol();
		System.out.println();
		Class_1.string();
		
	}

	@Override
	public void Circle_Area() {
		// TODO Auto-generated method stub
		double CircleArea = Class_2.pi*Class_2.r*Class_2.r;
		
		System.out.println(CircleArea);
	}

	@Override
	public void Rec_Area() {
		// TODO Auto-generated method stub
		int Rec_Area = Class_2.r*Class_2.l;
		
		System.out.println(Rec_Area);
	}

	@Override
	public void cylinder_Vol() {
		// TODO Auto-generated method stub
		double cylinder_Vol = Class_2.pi*Class_2.r*Class_2.r*Class_2.l;
		System.out.println(cylinder_Vol);
	}
	
	

	
	

	
}
