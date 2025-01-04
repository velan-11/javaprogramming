package patterns;
//ABC
//DEF
//GHI


import java.util.Scanner;

public class Prob9 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a num:");
//		int n=sc.nextInt();
		char ch = 65;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
