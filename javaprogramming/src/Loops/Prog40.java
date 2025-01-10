package Loops;

import java.util.Scanner;

//for each loop
public class Prog40 {
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
		for_each(a);
	}
	public static void for_each(int a[]) {
		for(int i:a) {
			System.out.print(i);
		}
		
	}

}
