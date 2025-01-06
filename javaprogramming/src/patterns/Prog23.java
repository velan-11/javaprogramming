package patterns;
//1    
//1 2   
//1 2 3  
//1 2 3 4 

import java.util.Scanner;

public class Prog23{
	public static void main(String[] args) {
		
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				if(row>=col)
				System.out.print(col+" ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
