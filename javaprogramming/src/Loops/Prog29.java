package Loops;

import java.util.Scanner;
// to find if the first 2 digits is a sum of third digit

public class Prog29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		sum_digit(a);
	}
	public static void sum_digit(int a) {
		int sum=0;
		int temp=a;
		int b=temp%10;
		a=a/10;
		while(a!=0) {
			int rem=a%10;
			sum+=rem;
			a=a/10;
		}
		if(sum==b) {
			System.out.println("first 2 digit is a sum of 3rd digit");
		}else {
			System.out.println("first 2 digit is not a sum of 3rd digit");
		}
	}

}
