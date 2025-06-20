package Random_test_practice;

import java.util.Arrays;
import java.util.Scanner;

/*product of array except self
Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: 

For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.*/
public class ProductArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(product(a)));
	}
	public static int[] product(int a[]) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int prod=1;
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					prod=prod*a[j];
					}
				}
			b[i]=prod;
		}
		return b;
	}
}
