package patterns;
//123
//456
//789

import java.util.Scanner;

public class Prob8 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a num:");
//		int n=sc.nextInt();
		int a = 1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
