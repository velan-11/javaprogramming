package Arrays;

import java.util.Scanner;

//to count the number of subarray that gives the sum of target value;
public class Prog54{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the target:");
		int target=sc.nextInt();
		sub_array(a,target);
	}
	public static void sub_array(int a[],int target) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=a[k];
										
					}
				if(sum==target) {
					count++;
				}
					
				}
				System.out.println();
				}
			
			
		System.out.println(count);
	}
	
}
