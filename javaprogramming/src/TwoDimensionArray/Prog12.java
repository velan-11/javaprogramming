package TwoDimensionArray;

import java.util.Scanner;

//to perform addition of two matrices
public class Prog12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the row:");
	int row=sc.nextInt();
	System.out.println("enter the size of the col:");
	int col=sc.nextInt();
	int[][] a=new int[row][col];
	System.out.println("enter the first matrix elements:");
	for(int i=0;i<a.length;i++) {
		System.out.println("enter the "+i+" row elements");
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int[][] b=new int[row][col];
	System.out.println("enter the second matrix elements:");
	for(int i=0;i<b.length;i++) {
		System.out.println("enter the "+i+" row elements");
		for(int j=0;j<b[i].length;j++) {
			b[i][j]=sc.nextInt();
		}
}	print(a);
System.out.println("  +");
	print(b);
	matrix_addition(a,b);
}
public static void matrix_addition(int a[][],int b[][]) {
	System.out.println("The resultant matrix:");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+b[i][j]+" ");
		}
		System.out.println();
}

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
