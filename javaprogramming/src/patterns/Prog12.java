package patterns;
//1 2 3 
//A B C
//1 2 3 

import java.util.Scanner;

public class Prog12{
	public static void main(String[] args) {

		char ch=65;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++)
			{
				if(row==2) {
					System.out.print(ch+" ");
					ch++;
				}else {
				System.out.print(col+" ");
			}
			}
			System.out.println();
		}

	}

}
