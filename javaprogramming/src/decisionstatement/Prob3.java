package decisionstatement;
import java.util.*;

public class Prob3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter angle1: ");
		int a=sc.nextInt();
		System.out.print("enter angle2: ");
		int b=sc.nextInt();
		System.out.print("enter angle3: ");
		int c=sc.nextInt();
		sc.close();
		
		valid_triangle(a,b,c);
		
		
	}
	public static void valid_triangle(int a,int b,int c) {
		if(a+b+c ==180) {
			System.out.println("The triangle is valid");
		}else {
			System.out.println("The triangle is not valid");
		}
			
		
	}
	
	

}
