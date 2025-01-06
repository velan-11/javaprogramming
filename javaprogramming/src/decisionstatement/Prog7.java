package decisionstatement;

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
