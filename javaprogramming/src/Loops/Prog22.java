package Loops;

import java.util.Scanner;

//to find fibonacci series
public class Prog22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of fibo series");
	int num=sc.nextInt();
	fibo(num);
}
public static void fibo(int a) {
	int fib1=0;
	int fib2=1;
	System.out.print(0+" "+1+" ");
	for(int i=1;i<a;i++) {
		int sum=fib1+fib2;
		System.out.print(sum+" ");
		fib1=fib2;
		fib2=sum;
	
}
}
}
