package Loops;
//to find whether the number is a perfect number
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
	System.out.println(i+" is the perfect square of "+a);
}
}
