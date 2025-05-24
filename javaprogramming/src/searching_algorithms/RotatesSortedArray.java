package searching_algorithms;

import java.util.Scanner;

public class RotatesSortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target element:");
		int target=sc.nextInt();
		
	}
}
