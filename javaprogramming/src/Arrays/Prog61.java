package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Given an integer array nums, move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.*/ 
//without creating another array(in-place)
public class Prog61 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		move_zero(a);

	}
	public static void move_zero(int a[]) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[index++]=a[i];
			}
				
	}	
		for(int i=index;i<a.length;i++) {
			a[index++]=0;
		}
	
		System.out.println(Arrays.toString(a));

	}
	}


