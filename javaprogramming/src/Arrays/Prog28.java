package Arrays;

import java.util.Scanner;

//left shift for n times
public class Prog28{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the times you want to left shift the array:");
		int n=sc.nextInt();
		sc.close();
		System.out.print("Before left shifting: ");
		print(a);
		System.out.println();
		System.out.print("After left shifting" + n +" times : ");
		n_times(a,n);
		print(a);
		
		
		
		
		
	}
	public static void left_shift(int a[]) {
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			}
		a[a.length-1]=first;
				
	}
		public static void print(int a[]) {
			for(int i:a) {
				System.out.print(i+" ");
			
		
	}
}
		public static void n_times(int a[],int n) {
			for(int i=0;i<n;i++) {
				left_shift(a);
		}
}
}