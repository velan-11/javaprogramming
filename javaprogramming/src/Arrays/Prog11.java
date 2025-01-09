package Arrays;

import java.util.Scanner;
//to get input from the user and get indices to swap,array and after swapping print the new array;
public class Prog11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int size=sc.nextInt();
		System.out.print("enter the array elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Before swapping: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n enter the first number index:");
		int i1=sc.nextInt();
		System.out.print("enter the second number index:");
		int i2=sc.nextInt();
		swap(a,i1,i2);
	}
	public static void swap(int a[],int c,int d) {
		int temp=a[c];
		a[c]=a[d];
		a[d]=temp;
		System.out.print("After swapping: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		

}
}
