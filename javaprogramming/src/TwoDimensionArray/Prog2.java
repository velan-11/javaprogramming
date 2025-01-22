package TwoDimensionArray;
//to print the length of 1d array which is inside 2d array;s
public class Prog2 {
	public static void main(String[] args) {
		int[] a[]= {{1,2,3,3},{4,9},{3,2,1}};
		elements(a);
	}
	public static void elements(int [][]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].length);
}
	}
}

