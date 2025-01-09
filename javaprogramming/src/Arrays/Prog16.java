package Arrays;

import java.util.Scanner;

//to left shift the array elements by one
public class Prog16{
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
		System.out.print("Before left shifting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		left_shift(a);
		
		
		
		
	}
	public static void left_shift(int a[]) {
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			}
		a[a.length-1]=first;
		System.out.println();
		System.out.print("After left shifting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	}
}
	