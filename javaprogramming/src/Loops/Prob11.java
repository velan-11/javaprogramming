package Loops;

import java.util.Scanner;

//factorial of a number
public class Prob11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to find the factorial: ");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int a) {
		int fact = 1;
		if (a == 0) {
			return fact;

		} else {
			int i = 1;
			while (i <= a) {
				fact = fact * i;
				i++;
			}
			return fact;
		}

	}

}
