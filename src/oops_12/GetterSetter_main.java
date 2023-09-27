package oops_12;

public class GetterSetter_main extends GetterSetter {

	public void FbLogin(String Username, String Password) {
		if (super.getUserName() == Username && super.getPassword() == Password) {

			System.out.println("Successfully login to Facebook");

		} else {
			System.err.println("UserName & Password Incorrect please try again");
		}
	}

	public void create_new_password(String user, String pass) {
		super.setUserName(user);
		super.setPassword(pass);
		if (super.getUserName() == user && super.getPassword() == pass) {

			System.out.println("create new Password and Username successfully");
			System.out.println("UserName : "+super.getUserName()+", Paaword : "+super.getPassword());
		} else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {

		GetterSetter_main s = new GetterSetter_main();
		s.FbLogin("zakirbaig0313", "zakir@baig.0313");
		s.create_new_password("zakir", "baig");
		s.FbLogin("zakirbaig0313", "zakir@baig.0313");
		s.FbLogin("zakir", "baig");
	}

}
