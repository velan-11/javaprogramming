package decisionstatement;
/*1.Write a program to input electricity unit charges and calculate total electricity bill according to the
given condition:
1. First 50 units rs.0.50/unit
2. For next 150 units rs.0.75/unit
3. For next 250 units rs1.20/unit
4. For unit above 250 rs.1.50/unit
An additional surcharge of 20% is added to the bill
2. Write a java program to print all the prime number in fibonacci series. 3. Write a java program to find sum of all digits in a number until the final result is single digit value
4. Write a java program to print fibonacci series in the range of 100-200*/

import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("units:");
		int units=sc.nextInt();
		bill(units);
	}
public static void bill(int units) {
	if(units<=50) {
		double bill=units*0.50;
		double total=(bill*0.2)+bill;
		System.out.println("bill:"+total);
	}else if(units>50 && units<=150) {
		double bill=units*0.75;
		double total=(bill*0.2)+bill;
		System.out.println("bill:"+total);
	}else if(units>150 && units<=250) {
		double bill=units*1.20;
		double total=(bill*0.2)+bill;
		System.out.println("bill:"+total);
	}else if(units>250) {
		double bill=units*1.50;
		double total=(bill*0.2)+bill;
		System.out.println("bill:"+total);
}
	
}
}
