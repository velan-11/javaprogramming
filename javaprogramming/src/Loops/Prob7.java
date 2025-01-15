package Loops;
// to find the product of digits of a given number.

import java.util.Scanner;

public class Prob7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("enter a num: ");
		int a=sc.nextInt();
		int b=product(a);
		System.out.println(b);
		
	}
	public static int product(int num) {
		int product=1;
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			product*=digit;
			
		}
		return product;
	}

}
