package returntype;

public class prg2 {
	public static void main(String[] args) {
		System.out.println(sum(20,30,40));
		System.out.println(sum(20,300));
		System.out.println(sum(20,30,100,82));
		}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
