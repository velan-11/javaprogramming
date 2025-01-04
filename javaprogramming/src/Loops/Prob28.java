package Loops;

import java.util.Scanner;

public class Prob28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		happy(a);
	}
	public static void happy(int n) {
		int sum=0;
		while(sum!=1) {
			while(n>0) {
				int digit=n%10;
				sum+=digit*digit;
				n=n/10;
			}
			n=sum;
		}
		if(sum==1) {
			System.out.println("it is a happy number");
		}else {
			System.out.println("it is not a happy number");
		}
		
	}
}

