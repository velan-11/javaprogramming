package patterns;
//ABC
//DEF
//GHI


import java.util.Scanner;

public class Prog10{
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a num:");
//		int n=sc.nextInt();
		int a=1;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if(a<=9) {
					System.out.print("0"+a+" ");
				}else {
				System.out.print(a+" ");
				
				}
				a++;
			}
			System.out.println();
		}

	}

}
