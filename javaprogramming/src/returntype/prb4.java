package returntype;//minute to hours

public class prb4 {
	public static void main(String[] args) {
		double res=hours(3600);
		System.out.println(res);
		
	}
	public static double hours(double min) {
		return min/60;
	}
	

}
