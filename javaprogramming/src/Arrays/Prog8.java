package Arrays;

import java.util.Scanner;

//to find maximum value in the first half of the array
public class Prog8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(maximum_first(a));
		
		
	}
	public static int maximum_first(int a[]) {
		int x=a[0];
		for(int i=0;i<a.length/2;i++) {
			if(a[i]<x) {
				x=a[i];
			}
			
		}
		
		
		return x;
	}
	
}
	