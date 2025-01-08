package Loops;

import java.util.Scanner;
//to print the product of a number until it becomes as single digit.ex-1*2*3=6
public class Prog42 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		prod(n);
	}
	public static void prod(int n) {
		while(n>9) {
			int prod=1;
			while(n!=0) {
				int rem=n%10;
				prod=prod*rem;
				n=n/10;
				
		}
			n=prod;
	}
		System.out.println(n);

}
}
