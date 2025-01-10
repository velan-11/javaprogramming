package Arrays;

import java.util.Scanner;

//right shift for n times
public class Prog25{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the times you want to right shift the array:");
		int n=sc.nextInt();
		sc.close();
		System.out.print("Before right shifting: ");
		print(a);
		System.out.println();
		System.out.print("After right shifting" + n +" times : ");
		n_times(a,n);
		print(a);
		
		
		
		
		
	}
	public static void right_shift(int a[]) {
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			}
		a[0]=last;
				
	}
		public static void print(int a[]) {
			for(int i:a) {
				System.out.print(i+" ");
			
		
	}
}
		public static void n_times(int a[],int n) {
			for(int i=0;i<n;i++) {
				right_shift(a);
		}
}
}