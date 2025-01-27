package Arrays;

import java.util.Scanner;
//to find the elements in the array which gives the sum of the given value 
public class Prog50 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	sum_2(a,n);
	
}
public static void sum_2(int a[],int n) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==n) {
				System.out.println(a[i]+" "+a[j]);
				break;
			}
			}
		}
}
}
