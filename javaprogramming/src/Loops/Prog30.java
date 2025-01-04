package Loops;

import java.util.Scanner;
//program to print the first n prime numbers
public class Prog30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int count=1;
		int num=2;
		while(count<=a) {
			if(prime_no(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}
	public static boolean prime_no(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
			
		}
		return true;
	}
	

}
