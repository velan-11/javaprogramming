package Arrays;

//
import java.util.Scanner;

public class Prog63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("enter the array elements:");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the number of rats:");
		int r = sc.nextInt();
		System.out.println("enter the unit:");
		int unit = sc.nextInt();
		System.out.println(amount_food(a, r, unit));
	}

	public static int amount_food(int a[], int r, int unit) {
		if (a.length == 0) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (sum >= r * unit) {
				return i;
			} else {
				sum += a[i];
			}

		}
		return 0;

	}

}
