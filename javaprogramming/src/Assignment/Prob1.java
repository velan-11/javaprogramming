package Assignment;

import java.util.Scanner;

//to find the roots of quadratic equation
public class Prob1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();
		roots(a,b,c);
		
		
	}
	public static void  roots(int a,int b,int c) {
		double x=b*b-(4*a*c);
		if(x>0) {
		double root1=-b+(Math.sqrt(x)/(2*a));
		double root2=-b-(Math.sqrt(x)/(2*a));
		System.out.println("The roots of the quadratic equation are: "+root1+" "+root2);
		return;
		}
		if(x==0) {
			double root=-b/(2*a);
			System.out.println("The roots of the quadratic equation are: "+root);
			return;
		}if(x<0) {
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-x)/(2*a);//here we are using - because we should not have negative sign inside square root
			System.out.println("The roots of the quadratic equation are: "+real+"+"+imaginary+"i"+" and "+real+"-"+imaginary+"i");
		}
		
		
	}
}
