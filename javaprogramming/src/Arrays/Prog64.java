package Arrays;

import java.util.*;

public class Prog64 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the sum value:");
		int sum=sc.nextInt();
		System.out.println(find_pair(a,sum));
	}
	public static int find_pair(int a[],int sum) {
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum && a[i]!=a[j]) {
					return i*j;
				}
			}
		}
	
	return 0;
}
}
