package Arrays;

import java.util.Scanner;

//to print subarrays of an array;
public class Prog51 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sub_array(a);
	}
	public static void sub_array(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]);
				}
				System.out.println();
				}
			}
	}
}
