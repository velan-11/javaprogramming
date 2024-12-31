package Assignment;

import java.util.Scanner;

public class Prob9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics mark : ");
		double p = sc.nextDouble();
		System.out.println("Enter Chemistry mark: ");
		double c = sc.nextDouble();
		System.out.println("Enter Biology mark : ");
		double b = sc.nextDouble();
		System.out.println("Enter Maths mark : ");
		double m = sc.nextDouble();
		System.out.println("Enter Computer mark : ");
		double co = sc.nextDouble();
		percentage(p,c,b,m,co);

	}

	public static void percentage(double p, double c, double b, double m, double co) {
		double percent = ((p + c + b + m + co) / 5) ;
		System.out.println("Percentage"+percent);
		if (percent >= 90 && percent <100) {
			System.out.println("Grade A");
		} else if (percent >= 80 && percent < 90) {
			System.out.println("Grade b");
		} else if (percent >= 70 && percent < 80) {
			System.out.println("Grade c");
		} else if (percent >= 60 && percent < 70) {
			System.out.println("Grade d");
		} else if(percent>=40 && percent<60) {
			System.out.println("Grade E");
	}else {
		System.out.println("POI PADI DA FAIL AITA NEE");}
	}
}
