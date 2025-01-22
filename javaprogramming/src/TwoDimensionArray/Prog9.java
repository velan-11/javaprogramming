package TwoDimensionArray;

import java.util.Scanner;

//to find the addition of all the columns elements in the array individually for each column
public class Prog9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row size:");
		int row=sc.nextInt();
		System.out.println("enter the column size:");
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(i+" "+j);
				a[i][j]=sc.nextInt();
			}
		}
		column_sum(a);
	}
	public static void column_sum(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[j][i];
			}
			System.out.println(i+":"+sum);
		}	}

}
