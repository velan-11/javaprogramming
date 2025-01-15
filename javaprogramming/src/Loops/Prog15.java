package Loops;
//to find whether the number is a perfect number
//25(5*5) is a perfect number and 28 is not
import java.util.Scanner;

public class Prog15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=sc.nextInt();
	perfect(a);
	
}
public static void perfect(int a) {
	int i=1;
	while(i*i<a) {
		i++;
	}
	if(i*i==a) {
		System.out.println(i+" is a perfect square of the perfect number "+a);
	}else
		System.out.println("It is not a perfect number");
}
}
