package Assignment;

import java.util.Scanner;

public class Prob12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		odd_even(num);
		
	}
	public static void odd_even(int a) {
		switch(a%2) {
		case 0:
			System.out.println("even no");
			break;
		
		case 1:
			System.out.println("odd no");
			break;
	}
	

}
}
