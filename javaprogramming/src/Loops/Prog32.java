package Loops;

import java.util.Scanner;

// to print the prime numbers between the given range
public class Prog32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		prime(a,b);
	}
	public static void prime(int a,int b) {
		for(int i=a;i<=b;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println(i);
		}
	}


}
}
