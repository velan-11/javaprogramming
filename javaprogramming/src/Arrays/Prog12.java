package Arrays;

import java.util.Scanner;

//to get element from the user and check whether the element is present in the array.if present return index else return -1;
//if duplicate elements present return the first index
public class Prog12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array:");
		int size = sc.nextInt();
		System.out.print("enter the array elements");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("enter the value of the element:");
		int value = sc.nextInt();
		System.out.println(element(a, value));
	}

	public static int element(int a[], int value) {
		int b = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				b = i;
				break;
			}
			

		}
		return b;
	}
}
