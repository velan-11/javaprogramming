package Arrays;

import java.util.Scanner;

//To find the occurrence of the given element
public class Prog37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		System.out.println("enter the array elements:");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the element to find its occurrence");
		int c = sc.nextInt();

		System.out.print("The number of times " + c + " present is " + countElement(a, c));

	}

	public static int countElement(int[] a, int c) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (c == a[i]) {
				count++;
			}
		}
		return count>0?count:-1;

	}
}
