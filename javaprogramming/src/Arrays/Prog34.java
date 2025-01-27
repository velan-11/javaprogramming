package Arrays;

import java.util.Scanner;
// to find all the missing elements between the maximum and minimum value in the array
//this is not correct program.the array will not always be sorted;
public class Prog34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		missing(a);
	}

	public static void missing(int a[]) {
		for(int i=0;i<a.length-1;i++) {//pass
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {//swap
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
		}
				}	
	}System.out.print("The missing elements are: ");
		int maximum=a[a.length-1];
		int minimum=a[0];
		for(int i=minimum;i<maximum;i++) {
			boolean present=false;
			for(int j=0;j<a.length-1;j++) {
				if(i==a[j]) {
					present=true;
					break;
				}
					
			}
			if(!present) {
				System.out.print(i+" ");
			}
		}
}
}