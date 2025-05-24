package Arrays;

import java.util.Scanner;
//to get input from the user and print it
public class Prog10 {
	public static void main(String[] args) {
		Scanner vasee=new Scanner(System.in);//it is not a proper identifier
		System.out.println("enter the size of array:");
		int size=vasee.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=vasee.nextInt();
		}
		print_array(a);
	}
	public static void print_array(int a[]) {
		System.out.print("The array elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}

}
}
