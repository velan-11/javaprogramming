package patterns;
//*   * 
//** **
//*****
//** **
//*   *


import java.util.Scanner;

public class Prog26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		triangle(n);
	}
	public static void triangle(int n) {
		for(int row=1;row<=2*n-1;row++) {
			for(int col=1;col<=2*n-1;col++) {
				if((row>=col && row+col<=n*2) ||  (row+col>=2*n && row<=col) )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}

}