package decisionstatement;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year: ");
		int year=sc.nextInt();
		leap_year(year);
		
	}
	public static void leap_year(int year) {
if(year % 4==0 && (year %400==0 || year%100!=0)) {
	System.out.println("the year is leap year");	
}else {
	System.out.println("the year is not a leap year");
}

	}

}
