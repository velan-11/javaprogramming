package Arrays;
// to print the even indices
public class Prog1 {
	public static void main(String[] args) {
		int []a= {22,01,20,04};
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(i+":"+a[i]);
			}
		}
		
	}

}