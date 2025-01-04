package Loops;

import java.util.Scanner;

// to check whether the given number is neon number
public class Prob26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=sc.nextInt();
	neon(a);
	
}
public static void neon(int a) {
	int temp=a;
	int product=a*a;
	int sum=0;
	while(product!=0) {
		int digit=product%10;
		sum+=digit;
		product/=10;
	}
	if(temp==sum) {
		System.out.println("It is a neon number");
	}else {
		System.out.println("It is not a neon number");
	}
	
}
}
