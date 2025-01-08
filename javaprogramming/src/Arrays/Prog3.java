package Arrays;
// to print the average of array elements
public class Prog3 {
	public static void main(String[] args) {
	
		
		int []a= {22,01,20,04};
		int v=arr(a);
		System.out.println(v);
}
		public static int arr(int[] a) {		
			int sum=0;
		for(int i=0;i<a.length;i++) {
		
				sum+=a[i];
				
			
			
		
		
	}
		return sum/a.length;
	}
}

