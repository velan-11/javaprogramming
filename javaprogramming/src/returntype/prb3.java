package returntype;

public class prb3 {
	public static void main(String[] args) {
		System.out.println(allow_user("admin","root"));
		
	}
	public static String allow_user(String user,String pass) {
		String s=user=="admin" && pass=="root"?"valid":"not valid";
		return s;
	}

}
