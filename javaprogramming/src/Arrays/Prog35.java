package Arrays;

import java.util.Scanner;

//To print the original elements in the array
public class Prog35{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		System.out.println("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
	}
		original(a);

}
	public static void original(int[] a) {
		System.out.print("The original elements are:");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]!=a[j]) {
					count++;
				}
				
			}if(count==a.length-1) {
				System.out.print(a[i]+" ");			
				}
			}
		}
		
	

}
