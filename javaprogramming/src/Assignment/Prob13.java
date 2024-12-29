package Assignment;

import java.util.Scanner;

public class Prob13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Gender :");
		String s = sc.nextLine();
		char gender = s.charAt(0);
		System.out.println("Enter your year of service: ");
		int service=sc.nextInt();
		System.out.println("Enter the qualification :");
		String qualification = sc.nextLine();
		
		salary(gender,service,qualification);
	}
	public static void salary()
}
