package Loops;

import java.util.Scanner;

//to find out the two given numbers are anagrams or not;
public class Prog34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int a = sc.nextInt();
		System.out.println("enter number 2:");
		int b = sc.nextInt();
		anagram(a, b);
	}

	public static void anagram(int a, int b) {
		int sum1 = 0;
		int sum2 = 0;

		while (a != 0) {
			int rem = a % 10;
			sum1 += rem;
			a = a / 10;
		}
		while (b != 0) {
			int rem = b % 10;
			sum2 += rem;
			b /= 10;
		}
		if (sum1 == sum2) {
			System.out.println("It is an anagram");

		} else {
			System.out.println("It is not an anagram");
		}

	}
}
