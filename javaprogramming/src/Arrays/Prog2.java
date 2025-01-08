package Arrays;
// to print the sum of even indices
public class Prog2 {
	public static void main(String[] args) {
	
		
		int []a= {22,01,20,04};
		int v=arr(a);
		System.out.println(v);
}
		public static int arr(int[] a) {		
			int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum+=a[i];
				
			}
			
		}
		return sum;
	}
	}

