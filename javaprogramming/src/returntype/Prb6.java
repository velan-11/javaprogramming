package returntype;
//design methods to find area of triangle ,
//rectangle,circle

public class Prb6 {
	public static void main(String[] args) {
		System.out.println(area(25,5));
		System.out.println(area(25.5,5.0));
		System.out.println(area(6));
			
}
	public static double area(double b,double h) {
		double a=1/2*(b*h);
		return a;
		
	}
	public static double area(double r) {
		double a=Math.PI*r*r;
		return a;
	}
	public static int area(int b,int h) {
		int a=b*h;
		return a;
	}
	
	}
	
	

