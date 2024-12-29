package returntype;

public class prb5 {
	public static void main(String[] args) {
		System.out.println(largest(340,22,10));
		
	}
	public static int largest(int a,int b,int c) {
		int n=a>b?a:b;
		int m=n>c?n:c;
		return m;
	}

}
