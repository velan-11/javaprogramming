package TwoDimensionArray;
//to print the 2d array using for each loop
import java.util.*;

public class Prog17 {
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
		print(a);
	}
	public static void print(int a[][]) {
		for(int[] i:a) {
			for(int j:i) {
				System.out.print(j+" ");
				
			}System.out.println();
			}
		System.out.println(Arrays.deepToString(a));
		}
	
	}