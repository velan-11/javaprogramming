package Arrays;

import java.util.Scanner;

//to merge two array into third one
public class Prog23 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array1: ");
	int size1=sc.nextInt();
	System.out.print("enter the size of the array2: ");
	int size2=sc.nextInt();
	System.out.print("enter the array1 elements:");
	int a[]=new int[size1];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.print("enter the array2 elements:");
	int b[]=new int[size2];
	for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
	}
	merge(a,b,size1,size2);
	
	
}
public static void merge(int a[],int b[],int size1,int size2) {
	int c[]=new int[size1+size2];
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
	}for(int i=a.length,j=0;i<c.length;i++) {
		c[i]=b[j++];
	}
System.out.print("Merged array values: ");
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
		}
	}
}