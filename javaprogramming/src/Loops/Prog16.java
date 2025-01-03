package Loops;
//to find whether the number is a perfect number
import java.util.Scanner;

public class Prog16 {
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
	System.out.println(i+" is the perfect square of "+a);
	}else {
		System.out.println("it is not a perfect square");
	}
}
}
