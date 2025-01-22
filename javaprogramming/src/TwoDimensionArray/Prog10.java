package TwoDimensionArray;

import java.util.Scanner;

//to copy one 2d array into another 2d array
public class Prog10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the row:");
		int row=sc.nextInt();
		System.out.println("enter the size of the col");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The original matrix elements:");
		print(a);
		copy_array(a,row,col);
	}
	public static void copy_array(int a[][],int row,int col) {
		int b[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=a[i][j];
			}
			}
		System.out.println("The copied matrix");
		print(b);

}
	public static void print(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
}
	}
}
