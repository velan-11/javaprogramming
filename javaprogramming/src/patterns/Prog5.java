package patterns;

import java.util.Scanner;
//n=5;
public class Prog5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows and colums");
	int n=sc.nextInt();
	sc.close();
	for(int row =1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row==n/2|| col==n/2) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
