package Arrays;

import java.util.Scanner;

//to print the duplicate elements in the array
public class Prog43 {
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
		for(int i=0;i<a.length;i++) {
			int count=1;//practically the element will be present once in the array.
			for(int j=i+1;j<a.length;j++) {//we are using i+1 because we dont need to count the same element again.
				if(a[i]==a[j]) {
					a[j]=Integer.MAX_VALUE;
					count++;
				}
				
			}
			if(a[i]!=Integer.MAX_VALUE && count>1) {
				System.out.println(a[i]);
			}
		}
	
	}
}

	