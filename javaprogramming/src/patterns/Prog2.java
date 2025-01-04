package patterns;

import java.util.Scanner;

public class Prog2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows and colums");
	int n=sc.nextInt();
	for(int row =1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row>=col) {
				System.out.print("*");
			}else {
				System.out.println(" ");
			}
		}
		System.out.println();
	}
}
}
