package Arrays;

import java.util.Scanner;

//to find the average of second half elements in the array
public class Prog17 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements :\n");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int v = arr(a);
		System.out.println("The average of second half elements in array is "+v);
	}

	public static int arr(int[] a) {
		int sum = 0;
		for (int i = a.length/2; i < a.length; i++) {

			sum += a[i];

		}
		return sum / (a.length-a.length/2);
	}
}
