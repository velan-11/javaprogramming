package decisionstatement;

import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("hardness:");
		int h=sc.nextInt();
		System.out.print("carbon content:");
		double cc=sc.nextDouble();
		System.out.print("Tensile strength:");
		int s=sc.nextInt();
		grade_steel(h,cc,s);
	}
public static void grade_steel(int h,double cc,int s) {
	if(h>50 && cc<0.7 && s>5600) {
		System.out.println("GRADE:10");
	}else if((h>50 && cc<0.7) || s>5600) {
		System.out.println("GRADE:9");
	}else if((h>50 && s>5600) ||  cc<0.7 ) {
		System.out.println("GRADE:8");
	}else if(h>50 || (cc<0.7 && s>5600)) {
		System.out.println("GRADE:7");
	}else if(h>50 || cc<0.7 || s>5600) {
		System.out.println("GRADE:6");
	}else {
		System.out.println("GRADE:5");
	}
}
	
}
