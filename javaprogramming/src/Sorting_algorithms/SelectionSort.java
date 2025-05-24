package Sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		selection(a);
		System.out.println(Arrays.toString(a));
		
	
}
	public static void selection(int a[]) {
		//a.length-1 is due to the n-1  iterations only required to sort the array 
		for(int i=0;i<a.length-1;i++) {
			int last=a.length-1-i;
			int max=maximum(a,0,last);
			swap(a,max,last);
			
		}
		
		
	}
	public static int maximum(int a[],int first,int last) {
		int max=a[0];
		int index=0;
		for(int i=0;i<=last;i++) {
			if(max<a[i]) {
				max=a[i];
				index=i;
			}
		}
		return index;	
	}
	public static void swap(int a[],int first,int last) {
		int temp=a[first];
		a[first]=a[last];
		a[last]=temp;
		
	}
	
	

}
