package Loops;

import java.util.Scanner;

//program to check if the given number is a prime number(different approach)
public class Prog24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		prime(a);
	}
	public static void prime(int a) {
		for(int i=1;i<=a;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println(i);
				
			}
		}
	}
}
