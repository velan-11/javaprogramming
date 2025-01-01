package Loops;
//to print the numbers that are divisible by both 3 and 5 in the given range
import java.util.Scanner;

public class Prob9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range: ");
		int num=sc.nextInt();
		no_div(num);
		
	}
	public static void no_div(int a) {
		int i=0;
		System.out.println("The numbers divisible by 3 and 5 are: ");
		while(i<a) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
				
			}
			i++;
		}
		
	}

}
