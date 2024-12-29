package Assignment;

import java.util.Scanner;

//a simple calculator using switch
public class Prob14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The possible operations are: ");
		System.out.println("addition + ,subtraction -,multiplication *,division / and modulus %");
		while(true) {
		System.out.print("Enter the symbol: ");
		char ch = sc.next().charAt(0);
		calculator(ch);
		}

	}

	public static void calculator(char a) {
		Scanner s = new Scanner(System.in);
		switch (a) {
		case '+': {
			System.out.print("enter the number1: ");
			double l = s.nextDouble();
			System.out.print("enter the number2: ");
			double m = s.nextDouble();
			System.out.println(l + "+" + m + "= " +add(l,m));
			break;
		}
		case '-': {
			System.out.print("enter the number1: ");
			double l = s.nextDouble();
			System.out.print("enter the number2: ");
			double m = s.nextDouble();
			System.out.println(l + "-" + m + "= " +sub(l,m));
			break;

		}
		case '*': {
			System.out.print("enter the number1: ");
			double l = s.nextDouble();
			System.out.print("enter the number2: ");
			double m = s.nextDouble();
			System.out.println(l + "*" + m + "= " +mul(l,m));
			break;

		}
		case '/': {
			System.out.print("enter the number1: ");
			double l = s.nextDouble();
			System.out.print("enter the number2: ");
			double m = s.nextDouble();
			System.out.println(l + "/" + m + "= " + div(l,m));
			break;

		}
		case '%': {
			System.out.print("enter the number1: ");
			double l = s.nextDouble();
			System.out.print("enter the number2: ");
			double m = s.nextDouble();
			System.out.println(l + "%" + m + "= " + mod(l,m));
			break;

		}
		default:
			System.out.println("Enter a valid symbol");
			System.out.println("The valid symbols are: +,-,*,/,%");
			

		}

	}

	public static double add(double a,double b) {
		return a+b;

	}

	public static double sub(double a,double b) {
		
		return a-b;

	}

	public static double mul(double a,double b) {
		return a*b;

	}
	public static double div(double a,double b) {
		return a/b;

	}
	public static double mod(double a,double b) {
		return a%b;

	}
	

}
