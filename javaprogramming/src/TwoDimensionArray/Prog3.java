package TwoDimensionArray;

import java.util.Scanner;

//to take input from the us

public class Prog3 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the 2d array");
		int size=sc.nextInt();
		int[] a[]= {{1,2,3},{2,4,9},{3,2,1}};
		elements(a);
	}
	public static void elements(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
