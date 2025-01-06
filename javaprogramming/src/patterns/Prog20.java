package patterns;
//*****
//** **
//*   *
import java.util.Scanner;

public class Prog20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		triangle(n);
	}
	public static void triangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=2*n-1;col++) {
				if(col-row>=n-1 || row+col<=n+1 )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}

}
