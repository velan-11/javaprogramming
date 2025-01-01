package Loops;

import java.util.Scanner;

public class Prog13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal value:");
		int a=sc.nextInt();
		binary(a);
	}
	public static void binary(int a) {
		String binary="";
		while(a!=0) {
			int digit=a%2;
			binary+=digit;
			a=a/2;
			
		}
		
		int i=binary.length()-1;
		while(i>=0) {
			System.out.print(binary.charAt(i));
			i--;
			
		}
		
		
		
		
		
	}

}
