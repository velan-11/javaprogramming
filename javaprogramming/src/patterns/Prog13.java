package patterns;
//1 1 1 
//A B C
//3 3 3 

import java.util.Scanner;

public class Prog13{
	public static void main(String[] args) {

		char ch=65;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++)
			{
				if(row==2) {
					System.out.print(ch+" ");
					ch++;
				}else {
				System.out.print(row+" ");
			}
			}
			System.out.println();
		}

	}

}
