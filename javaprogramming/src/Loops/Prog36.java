package Loops;

import java.util.Scanner;

// to print the fibonacci series in reverse order from 5000-500
public class Prog36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a range:");
		int a=sc.nextInt();
		fibonacci(a);

	}


	public static void fibonacci(int a) {
		int n=0;
		int n1=1;
		while(n1<=a) {
			int sum=n+n1;
			if(sum>a)
				break;
			n=n1;
			n1=sum;
			
		}
		System.out.println(n1);
		System.out.println(n);
		while(n>500) {
			int diff=n1-n;
			if(diff <500)
				break;
			System.out.println(diff);
			n1=n;
			n=diff;
			
		}
		

	}
}
