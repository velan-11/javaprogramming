package Arrays;

import java.util.Scanner;

//to rotate the second half  of the elements in the right
public class Prog33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Before rotating:");
		print(a);
		System.out.print("\nAfter rotating:");
		second_rotate(a);
		print(a);
	}
public static void second_rotate(int a[]) {
	int last=a[a.length-1];
	for(int i=a.length-1;i>a.length/2;i--) {
		a[i]=a[i-1];
		
	}
	a[a.length/2]=last;
}
public static void print(int a[]) {
	for(int i:a) {
		System.out.print(i+" ");
	}
}

}
