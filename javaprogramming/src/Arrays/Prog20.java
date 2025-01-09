package Arrays;

import java.util.Scanner;

//to find the difference between maximum and minimum value in the array
public class Prog20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array:");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int x=maximum(a);
		int y=minimum(a);
		System.out.println("The difference b/w maximum and minimum value in the array is "+ (x-y));

	}
public static int maximum(int a[]) {
		int x=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>x) {
				x=a[i];
			}
				}
		return x;
	
}
public static int minimum(int a[]) {
	int x=a[0];
	for(int i=0;i<a.length;i++){
		if(a[i]<x) {
			x=a[i];
		}
			}
	return x;

}

}