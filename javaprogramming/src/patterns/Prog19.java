package patterns;
//A 3 4 5 6 
//3 B 4 5 6 
//3 4 C 5 6 
//3 4 5 D 6 
//3 4 5 6 E

import java.util.Scanner;

public class Prog19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		triangle(n);
	}
	public static void triangle(int n) {
		char ch=65;
		int n1=3;
		for(int row=1;row<=2*n-1;row++) {
			for(int col=1;col<=2*n-1;col++) {
				if(row==col )
				System.out.print(ch+++" ");
				else
					System.out.print(n1+++" ");
			}
			System.out.println();
			n1=3;
			}
		}

}
