package Assignment;

import java.util.Scanner;

public class Prob7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		difference(num);
	}
	public static void difference(int a) {
		if(30-a>0) {
			System.out.println(30);
	}	if(30-a<0) {
			System.out.println(3*30);
	}
		
	}

}
