package Loops;

import java.util.Scanner;

//program to check if the given number is a prime number(different approach)
public class Prog23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		prime(a);
	}
	public static void prime(int a) {
		
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
	}
}
