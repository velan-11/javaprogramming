package Loops;
//to reverse a number for given test case: like---> 4321=2143
import java.util.Scanner;

public class Prog19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		reverse(num);

	}

	public static void reverse(int a) {
		int count = 0;
		int temp = a;
		while (a != 0) {
			count++;
			a = a / 10;
		}
		count(count,temp);
	}

	public static int power(int a, int b) {
		int product = 1;
		while (b != 0) {
			product = product * a;
			b--;

		}
		return product;

	}
	public static void count(int count,int temp) {
		count = count / 2;
		String reversed = "";
		int c = power(10, count);
		int d=temp%c;
		reversed=reversed+d;
		int e=temp/c;
		reversed=reversed+e;
		System.out.println(reversed);
	}
}
