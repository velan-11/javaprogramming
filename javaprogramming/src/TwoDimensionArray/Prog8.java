package TwoDimensionArray;

import java.util.Scanner;

//design a method to read matrix elements from the users
public class Prog8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		System.out.println("enter the number of columns");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			System.out.println("enter the "+i+" row elements:");
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		elements(a);
	}
	public static void elements(int [][]a) {
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			
			}
			
			
		}
		
			
		}
	

