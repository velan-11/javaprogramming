package Assignment;
/*13. A library charges a fine for every book returned late. Fot first 5 days
the fine is 50 paise, for 6-10 days fine is one rupee and above 10 days
fine is 5 rupees. If you return the book after 30 days your membership
will be cancelled. Write a program to accept the number of days the
member is late to return the book and display the fine and the appropriate
message*/

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the delay days :");
		int days=sc.nextInt();
		delay(days);
		
	}
	public static void delay(int days) {
		if(days<=5) {
			System.out.println("Fine : 50 paise");
			return;
		}if(days>5 && days<=10) {
			System.out.println("Fine : 1 rupee");
			return;
		}if(days>10) {
				System.out.println("Fine : 5 rupees");
			}
		if(days>30) {
			System.out.println("You memebership is cancelled bruhhh");
		}
			
		
	}

}
