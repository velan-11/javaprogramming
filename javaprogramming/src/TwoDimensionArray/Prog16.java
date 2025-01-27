package TwoDimensionArray;

import java.util.Scanner;
//to print the minimum value in the each columns
public class Prog16 {
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
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		col_min(a);
	}public static void col_min(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[j][i]) {
					min=a[j][i];
				}
				
			}
			System.out.println(min);
		}
		
	}
}