package Loops;

import java.util.Scanner;

// to print the fibonacci series from 1000 to 10000
public class Prog35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a range:");
		int a = sc.nextInt();
		fibonacci(a);

	}

	public static void fibonacci(int a) {
		int n = 0;
		int n1 = 1;
//		System.out.println(n + " ");
//		System.out.println(n1 + " ");
		while (n1 <= a) {
			int sum = n + n1;
			n = n1;
			n1 = sum;
			if(sum>=100) {
				System.out.println(sum);
			}
		}

	}
}
