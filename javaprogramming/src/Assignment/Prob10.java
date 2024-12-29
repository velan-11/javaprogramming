package Assignment;

import java.util.Scanner;

public class Prob10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		ramp(num);

	}

	public static void ramp(int a) {
		if(a%2!=0) {
			System.out.println("Weird");
		}else if(a%2==0 && (a>=2 && a<=6)) {
			System.out.println("Not weird");
		}else if(a%2==0 && (a>=7 && a<=20)) {
			System.out.println("Weird");
		}else if(a%2==0 && a>20) 
		{
			System.out.println("Not Weird");
		}
}
}
