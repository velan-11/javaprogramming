package patterns;

import java.util.Scanner;

public class Prog3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows and colums");
	int n=sc.nextInt();
	sc.close();
	for(int row =1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row+col>=n+1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
