package Loops;

import java.util.Scanner;

//power of a number
public class Prog12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the power :");
		int a=sc.nextInt();
		System.out.println("Enter the power number: ");
		int b=sc.nextInt();
		power(a,b);
		
	}
	public static void power(int a,int b) {
		int product=1;
		while(b>0) {
			product=product*a;
			b--;
			
		}
		System.out.println(product);
		
	}
	
	

}
