package Arrays;

/*given an array of elements,where the elements are equated in 
such a way that the position has to be filled with the multiplication 
of all the other elements except self*/

import java.util.*;

public class Prog57 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		mul_array(a);
		
		
	}
	public static void mul_array(int a[]) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int prod=1;
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					prod*=a[j];
					}
			}
				b[i]=prod;
				}
			
			
		
		System.out.println(Arrays.toString(b));
	}
}
