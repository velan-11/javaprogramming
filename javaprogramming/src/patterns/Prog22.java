package patterns;
//1    
//2 3   
//4 5 6  
//7 8 9 10 

import java.util.Scanner;

public class Prog22{
	public static void main(String[] args) {
		int n=1;
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				if(row>=col)
				System.out.print(n+++" ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
