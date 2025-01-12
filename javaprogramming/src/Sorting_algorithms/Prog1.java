package Sorting_algorithms;

import java.util.Scanner;
//to sort in descending order
public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Before swapping:");
		print(a);
		bubble_sort(a);
		System.out.print("\nAfter swapping: ");
		print(a);
	}

	public static void bubble_sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {//pass
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {//swap
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
		}
				}	
	}	
}
	public static void print(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
}
	}}
