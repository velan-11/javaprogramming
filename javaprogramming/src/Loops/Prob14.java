package Loops;

import java.util.Scanner;
//To find the count of digits in a number
public class Prob14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a  num:");
	int a=sc.nextInt();
	digits(a);
}
public static void digits(int a) {
	int count=0;
	while(a!=0) {
		count++;
		a=a/10;
	}
	System.out.println(count);
}
}
