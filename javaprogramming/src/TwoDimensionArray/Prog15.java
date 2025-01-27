package TwoDimensionArray;
//to find the product of all the minor diagonal elements in the matrix
import java.util.*;
public class Prog15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row=sc.nextInt();
		System.out.println("enter the number of columns");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			System.out.println("enter the "+i+" row elements");
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();			
				}
		}
		
		minor_diagonal(a);
		
	}
	public static void minor_diagonal(int [][] a) {
		int product=1;
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i+j==row-1) {
					product*=a[i][j];
				}		
				}
		}
		System.out.println(product);
	}
}