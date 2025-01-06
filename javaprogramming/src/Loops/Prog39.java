package Loops;

import java.util.Scanner;

//program to find if the given number is a xylem or phloem number
public class Prog39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		xylem(a);
	}
public static void xylem(int a) {
	int count=0;
	int temp=a;
	int temp1=a;
	while(temp!=0) {
		count++;
		temp=temp/10;
	}
	int prod=1;
	count=count-1;
	while(count!=0) {
		prod=prod*10;
		count--;
	}
	int first_no=a/prod;
	int last_no=a%10;
	int sum=0;
	while(temp1!=0) {
		int rem=temp1%10;
		sum=sum+rem;
		temp1=temp1/10;
		
	}
	int mid_mean=sum-(first_no+last_no);
	if(first_no+last_no==mid_mean) {
		System.out.println("It is a Xylem number");
	}else {
		System.out.println("It is a pholem number");
	}
	
}

}
