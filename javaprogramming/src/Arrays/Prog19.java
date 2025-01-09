package Arrays;

import java.util.Scanner;

//to copy one array to other array
public class Prog19 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	duplicate(a,size);
	
	
}
public static void duplicate(int a[],int size) {
	int b[]=new int[size];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
}System.out.print("New array values: ");
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
		}
	}
}