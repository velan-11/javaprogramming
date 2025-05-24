package Arrays;

import java.util.Scanner;
//to reverse only the even index of an array 
//this is wrong check again
public class Prog29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.print("Before reversing:");
	print(a);
	reverse(a);
	
	System.out.print("\nAfter reversing:");
	print(a);
	
	
	
}
public static void reverse(int a[]) {
	int i=0;
	if(a.length-1%2==0) {
		i=a.length-1;
	}else
		i=a.length-2;
	for(int j=0;i>j;i-=2,j+=2) {
			
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
}	
}
public static void print(int a[]) {
	for(int i:a) {
System.out.print(i+" ");

}
}
}