package returntype;

public class Prg1 {
	public static void main(String[] args) {
		char a=get_char(65);
		System.out.println(a);
	}
	public static char get_char(int a) {
		char ch=(char)a;
		return ch;
		
	}

}
