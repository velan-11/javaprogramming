package Arrays;

import java.util.Scanner;

//to right shift the array elements by one
public class Prog14{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("Before right shifting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		right_shift(a);
		
		
		
		
	}
	public static void right_shift(int a[]) {
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			}
		a[0]=last;
		System.out.println();
		System.out.print("After Right shifting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	}
}
	