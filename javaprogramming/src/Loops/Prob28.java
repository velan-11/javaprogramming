package Loops;
//To check whether the given number is happy number or not+

/*A happy number is a number defined by the following process:
Start with any positive integer.
Replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1(where it will remain), or it loops endlessly in a cycle that does not include 
1.
Numbers that end in 1 are called happy numbers, and those that do not are called unhappy numbers.*/
import java.util.Scanner;

public class Prob28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		happy(a);
	}
	public static void happy(int n) {
		
		while(n>9) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum+digit*digit;
				n/=10;
			}
			n=sum;
			
			}
			
		if(n==1) {
			System.out.println("it is a happy number");
		}else {
			System.out.println("it is not a happy number");
		}
		
	}
}

