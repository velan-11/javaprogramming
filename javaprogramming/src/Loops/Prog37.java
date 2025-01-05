package Loops;

import java.util.Scanner;
//to add the initial 30 prime numbers

public class Prog37 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range to find the sum of prime numbers:");
	int a=sc.nextInt();
	int i=1;
	int sum=0;
	int count=0;
	while(count<30) {
		if(is_prime(i)) {
			sum+=i;
			count++;
		}
		i++;
		
	}
	System.out.println(sum);
}
public static boolean is_prime(int a) {
	if(a==1) {
		return false;
	}
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}

	}
	return true;
	
}
}
