package Arrays;

import java.util.Scanner;

//to read all the array elements in the reverse order
public class Prog15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=a.length-1;i>=0;i--) {
			a[i]=sc.nextInt();
		}
		
		print(a);
		
		
	}
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	
	}
}
	