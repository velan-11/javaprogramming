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
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}

		}
		boolean[] b=new boolean[max+1];
		
		for(int i=0;i<max;i++) {
			b[i]=false;
		}
		System.out.print("The duplicate elements are: ");
		for(int i=0;i<a.length;i++) {
			if(b[a[i]]) {
				System.out.print(a[i]+" ");
			}else {
				b[a[i]]=true;
			}
			
}
}
}
