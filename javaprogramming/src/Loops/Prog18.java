package Loops;
//sum of all even numbers
import java.util.Scanner;

public class Prog18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=sc.nextInt();
	int sum=0;
	int i=0;
	while(i<=a) {
		if(i%2==0) {
			sum+=i;
		}
		i++;
	}
	System.out.println(sum);
	
}
}
	
