package Loops;
// to check whether the given number is a prime number or not

import java.util.Scanner;

public class Prob21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int num=sc.nextInt();
		prime(num);
	}
	public static void prime(int a) {
		if(a==1) {
			System.out.println("it is not a prime number");
			return;
		}
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				System.out.println("it is a not prime number");
				break;
			}else {
				System.out.println("it is a prime number");
				break;
				
			}
		}
	}
		
	

}
