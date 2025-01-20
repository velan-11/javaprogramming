package Arrays;

import java.util.Scanner;

//to remove an element from the array
public class Prog38{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.print("Enter the element index you want remove:");
	int index=sc.nextInt();
	int[] b=remove(a,index);
	for(int i=0;i<b.length;i++) {
		System.out.print(a[i]+" ");
	}
	
	
	
}
public static int[] remove(int a[],int index) {
	int b[]=new int[a.length-1];	
	for(int i=0;i<index;i++) {
		b[i]=a[i];
}
for(int i=index+1;i<a.length;i++) {
	b[i-1]=a[i];
}
	return b;

	}
}