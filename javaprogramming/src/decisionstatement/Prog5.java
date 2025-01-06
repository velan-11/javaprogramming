package decisionstatement;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time required:");
		double a=sc.nextDouble();
		efficiency(a);
	}
	public static void efficiency(double time) {
		if(time>=2 && time<=3) {
			System.out.println("Highly efficient");
		}else if(time>=3 && time<=4)
			System.out.println("Improve your speed");
		else if(time>=4 && time<=5)
			System.out.println("You must attend the training");
		else
			System.out.println("Leave the company");
		
	}

}
