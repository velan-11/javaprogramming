package Loops;
// to reverse a number

import java.util.Scanner;

public class Prob6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter a num: ");
		int a=sc.nextInt();
		int b=sum(a);
		System.out.println(b);
		
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