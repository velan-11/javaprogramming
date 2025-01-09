package Arrays;

import java.util.Scanner;

//to find the frequency of every elements in the array
public class Prog18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		frequency(a);
		
		
	}
	public static void frequency(int a[]) {
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}System.out.println(a[i]+" : "+count);
		}
	
	}
}
	