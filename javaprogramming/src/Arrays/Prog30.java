package Arrays;

import java.util.Scanner;

//To print only the duplicate elements in the array
public class Prog30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		duplicate(a);
		
		
	}
	public static void duplicate(int a[]) {
		System.out.print("The duplicate elements in the array are ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}
}
