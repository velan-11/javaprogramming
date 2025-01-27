package TwoDimensionArray;
// to transpose a non square matrix;

import java.util.Scanner;

public class Prog13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the row:");
		int row=sc.nextInt();
		System.out.println("enter the size of the column:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The original matrix:");
		print(a);
		System.out.println("The transposed matrix:");
		print(transpose(a,row,col));
		
	}
	public static int[][] transpose(int a[][],int row,int col) {
		int[][] b=new int[col][row];//transpose means changing of rows and columns(if its sqr matrix no need)
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[j].length;j++) {
				b[i][j]=a[j][i];
				
			}
		}
		return b;
		
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
