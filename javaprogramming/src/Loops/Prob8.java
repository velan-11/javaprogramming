package Loops;
// to reverse a number

import java.util.Scanner;

public class Prob8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("enter a num: ");
		int a=sc.nextInt();
		int b=product(a);
		int c=sum(a);
		if(b==c) {
			System.out.println("It is a spy number");
		}else {
			System.out.println("It is not a spy number");
		}
		
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
	public static int sum(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			sum+=digit;
			
		}
		return sum;
	}

}
