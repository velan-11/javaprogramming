package TwoDimensionArray;
//to print all the elements in the 2d array.
public class Prog1 {
	public static void main(String[] args) {
		int[] a[]= {{1,2,3},{2,4,9},{3,2,1}};
		elements(a);
	}
	public static void elements(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
