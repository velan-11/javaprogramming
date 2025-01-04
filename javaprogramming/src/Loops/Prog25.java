package Loops;

import java.util.Scanner;
//to find the largest prime number between the given range
public class Prog25 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the starting number:");
	int a=sc.nextInt();
	System.out.println("enter the ending number:");
	int b=sc.nextInt();
	largest_prime(a,b);
	
}
public static void largest_prime(int a,int b) {
	for(int i=b;i>=a;i--){
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(i);
			break;
		}
		
	}
}
}
