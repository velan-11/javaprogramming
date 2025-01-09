package Arrays;

import java.util.Scanner;
//to reverse an array
public class Prog22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	reverse(a,size);
	
	
}
public static void reverse(int a[],int size) {
	int b[]=new int[size];
	for(int i=a.length-1, j=0;i>=0;i--,j++) {
		b[j]=a[i];
}System.out.print("New array values: ");
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
		}
	}
}