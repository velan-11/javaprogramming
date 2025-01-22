package TwoDimensionArray;
//to print the sum of the each row in the matrix
public class Prog5 {
	public static void main(String[] args) {
		int[] a[]= {{10,2,3},{2,15,9},{3,2,5}};
		elements(a);
	}
	public static void elements(int [][]a) {
		
	
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				
					sum+=a[i][j];
			
			}
			System.out.println(i+":"+sum);
		}
			
		}
	}

