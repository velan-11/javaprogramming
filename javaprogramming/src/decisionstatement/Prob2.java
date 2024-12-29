package decisionstatement;
import java.util.*;

public class Prob2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a: ");
		int a=sc.nextInt();
		System.out.print("enter b: ");
		int b=sc.nextInt();
		System.out.print("enter c: ");
		int c=sc.nextInt();
		
		largest(a,b,c);
		
	}
	public static void largest(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("A is largest");
			return;
		}	
		if(b>a && b>c) {
			System.out.println("B is largest");
			return;
		}
		if(c>a && c>b)
		{
			System.out.println("C is largest");
			return;
		}
		
	}
	
	

}
