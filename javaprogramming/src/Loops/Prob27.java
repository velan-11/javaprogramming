package Loops;

import java.util.Scanner;
//to check whether the given number is a sunny number or not.
//A number n is a sunny number if n+1 is a perfect square.
//example of perfect square is 25 =5*5


public class Prob27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		sunny(a);
	}
	public static void sunny(int a) {
		int b=a+1;
		int sum=0;
		int i=1;
		while(i*i<b) {
			i++;	 
				
			}
		if(i*i==b) {
			System.out.println("it is a sunny number");
		}else {
			System.out.println("it is not a sunny number");
		}
		
	}
}

