package patterns;

import java.util.Scanner;

public class Prob7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=sc.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print(row);
			}
			System.out.println();
			}
			

		}

	}


