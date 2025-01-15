package Loops;
// to check whether the given number is a palindrome or not
//A number is called palindrome when the original number is equal to the reversed original number.

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter a num: ");
		int a=sc.nextInt();
		int b=reverse(a);
		if(a==b) {
			System.out.println("GIVEN NUMBER IS A PALINDROME");
		}else {
			System.out.println("GIVEN NUMMBER IS NOT A PALINDROME");
		}
	}
	public static int reverse(int num) {
		int reversed=0;
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			reversed=reversed*10+digit;
			
		}
		return reversed;
	}

}
