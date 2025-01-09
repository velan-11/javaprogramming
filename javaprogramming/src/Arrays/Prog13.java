package Arrays;

import java.util.Scanner;

//to find addition of second half element of array
public class Prog13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The sum of second half of the array is"+sum_second(a));
		
		
	}
	public static int sum_second(int a[]) {
		int sum=0;
		for(int i=a.length/2;i<a.length;i++) {
			sum+=a[i];
			
		}
		
		
		return sum;
	}
	
}
	