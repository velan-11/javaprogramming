package Loops;

import java.util.Scanner;

//armstrong number without using method
public class Prog21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		armstrong(a);
		
	}
	public static void armstrong(int a) {
		int count=0;
		int temp=a;
		int temp1=a;
		while(a!=0) {
			count++;
			a=a/10;
			
		}
		int sum=0;
		while(temp!=0) {
			int pow=count;
			
			int rem=temp%10;
			int product=1;
			while(pow>0) {
				product=product*rem;
				pow--;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(temp1==sum) {
			System.out.println("it is an armstrong no");
		}else {
			System.out.println("it is not an armstong no");
		}
		
		
		
	}

}
