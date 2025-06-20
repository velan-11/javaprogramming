package patterns;
//  *  
// * * 
//*   *
// * * 
//  *  

//if hollow means use OR logic or use AND 



import java.util.Scanner;

public class Prog29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		triangle(n);
	}
	public static void triangle(int n) {
		for(int row=1;row<=2*n-1;row++) {
			for(int col=1;col<=2*n-1;col++) {
				if(row+col==n+1 || row+col==3*n-1 || row-col==n-1 || col-row==n-1 )//if n=3 only we can use 2n+2;
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}

}
