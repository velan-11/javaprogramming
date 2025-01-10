package Arrays;

import java.util.Scanner;

//to reverse the each two digit numbers in the array
public class Prog31 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Before reversing:");
		print(a);
		for(int i=0;i<a.length;i++) {
			a[i]=reverse(a[i]);
		}
		System.out.print("\nAfter reversing:");
		print(a);
		
	}
public static int reverse(int a) {
	int res=a;
	if(a>9) {
	int first=a/10;
	int last=a%10;
	res=last*10+first;
	}
	return res;
}
public static void print(int a[]) {
	for(int i:a) {
System.out.print(i+" ");
}
}
}
