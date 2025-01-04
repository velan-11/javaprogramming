package patterns;
//ABC
//DEF
//GHI


import java.util.Scanner;

public class Prog10{
	public static void main(String[] args) {
/// 	01 02 03 04 05 
//		06 07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25 

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
