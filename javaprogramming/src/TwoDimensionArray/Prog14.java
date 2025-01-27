package TwoDimensionArray;

import java.util.Scanner;

/*
 * 
 *  multiplication of two matrices;
condition for matrix multiplication is that columns in the first matrix should be equal to rows 
in the second matrix
*
*
*/
public class Prog14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sizes of the first matrix:");
		System.out.println("enter the size of row:");
		int row1=sc.nextInt();
		System.out.println("enter the size of col:");
		int col1=sc.nextInt();
		int[] a[]=new int[row1][col1];
		System.out.println("enter first matrix values:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				a[i][j]=sc.nextInt();
			}
		}System.out.println("enter the sizes of the second matrix:");
		System.out.println("enter the size of row:");
		int row2=sc.nextInt();
		System.out.println("enter the size of col:");
		int col2=sc.nextInt();
		if(col1 !=row2) {
			System.out.println("Matrix multiplication is not possible");
			return;
		}
		int[] b[]=new int[row2][col2];
		System.out.println("enter second matrix values:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		mat_mul(a,b,row1,row2,col1,col2);
	}	
		public static void mat_mul(int[][] a,int b[][],int row1,int col1,int row2,int col2) {
			int c[][]=new int[row1][col2];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<row2;k++) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("The resultant matrix is");
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
