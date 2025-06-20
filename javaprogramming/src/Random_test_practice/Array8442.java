package Random_test_practice;

import java.util.Arrays;

public class Array8442 {
	public static void main(String[] args) {
		int a[][]= {{5,6,7},{9,0,3},{2,0,1}};
		spiral(a);
	}
	public static void spiral(int a[][]) {
		int m=a.length;
		int n=a[0].length;
		int result[]=new int[m*n];
		int top=0;int bottom=m-1;
		int left=0;int right=n-1;
		int index=0;
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				result[index++]=a[top][i];
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				result[index++]=a[i][right];
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					result[index++]=a[bottom][i];
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					result[index++]=a[i][left];
				}
				left++;
			}
			}
		System.out.println(Arrays.toString(result));
	}
}
