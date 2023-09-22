package oops;

// class not Interface -- Interface_car_making -- it is also Sub class
// Interface --Interface_Body  -- it is also super1 class
// Interface --Interface_Engine  -- it is also super2 class

//              
public class Interface_car_making implements Interface_Body,Interface_Engine {

	public static void main(String[] args) {
		Interface_car_making obj = new Interface_car_making();
		System.out.println("car making parts");
		obj.frame();
		obj.chaches();
		obj.engine();
		obj.gearbox();

	}

	@Override
	public void frame() {
		// TODO Auto-generated method stub
		System.out.println("car frame");
		
	}

	@Override
	public void chaches() {
		// TODO Auto-generated method stub
		System.out.println("car chahces");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("car engine");
		
	}

	@Override
	public void gearbox() {
		// TODO Auto-generated method stub
		System.out.println("car gear box");
		
	}

}
