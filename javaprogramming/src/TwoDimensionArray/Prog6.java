package TwoDimensionArray;
//design a method to find largest value in the square matrix.
public class Prog6 {
	public static void main(String[] args) {
		int[] a[]= {{10,2,3},{2,15,9},{3,2,5}};
		elements(a);
	}
	public static void elements(int [][]a) {
		
		int largest=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>largest) {
					largest=a[i][j];
				}
			
			}
			
		}
		System.out.println(largest);
			
		}
	}

