package Loops;
//to find whether the number is a armstrong number.
/*An Armstrong number (also known as a Narcissistic number or Pluperfect number) is a number that is equal to the sum of its own digits,
each raised to the power of the number of digits in the number.*/
import java.util.Scanner;

public class Prog17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=sc.nextInt();
	armstrong(a);
	
}
public static void armstrong(int a) {
	int power=0;
	int temp=a;
	int sum=0;
	while(a!=0) {
		power++;
		a=a/10;
	}int b=temp;
	while(b!=0) {
		int digit=b%10;
		sum=sum+power(digit,power);
		b=b/10;
	}
	if(temp==sum) {
		System.out.println("it is an armstrong number");
		
	}else {
		System.out.println("it is not an armstrong number");
	}
	

}
public static int power(int a,int b) {
	int product=1;
	while(b!=0) {
		product=product*a;
		b--;
	}
	return product;
}
	
	

}
