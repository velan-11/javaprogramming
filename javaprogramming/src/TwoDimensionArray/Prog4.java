package TwoDimensionArray;
//to print all the even elements in the 2d array.
public class Prog4 {
	public static void main(String[] args) {
		int[] a[]= {{1,2,3},{2,4,9},{3,2,1}};
		System.out.println(a[2][1]);
		elements(a);
	}
	public static void elements(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					System.out.println(a[i][j]);
				}
			}
			
		}
	}
}
