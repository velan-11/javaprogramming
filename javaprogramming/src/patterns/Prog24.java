package patterns;
//A   
//12  
//BCD 
//3456

import java.util.Scanner;

public class Prog24{
	public static void main(String[] args) {
		int n=1;
		char ch=65;
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				if(row>=col) {
					if(row==1 || row==3)
						System.out.print(ch++);
					else
						System.out.print(n++);
				}
				
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
