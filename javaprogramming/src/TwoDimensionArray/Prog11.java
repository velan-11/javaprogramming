package TwoDimensionArray;
//to find the transpose of the matrix
import java.util.*;
public class Prog11 {
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
		System.out.println("original matrix:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
	}
		transpose(a);
		
	}
	public static void transpose(int a[][]) {
		System.out.println("transpose of the matrix:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[j][i]+" ");
		}
			System.out.println();
	}

}
}
