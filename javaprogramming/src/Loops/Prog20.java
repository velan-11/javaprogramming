package Loops;
//to find if the given number is a perfect number
//here the perfect number refers to sum of its divisors except the number itself(6=1+2+3)
import java.util.Scanner;

public class Prog20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=sc.nextInt();
	perfect(a);
	
}
public static void perfect(int a) {
	int i;
	int sum=0;
	for(i=1;i<=a/2;i++) {
		if(a%i==0) {
			sum+=i;
		}
		
	}
	if(sum==a) {
		System.out.println("it is a perfect number");
	}else {
		System.out.println("it is not a perfect number");
	}
}
	
	

}
