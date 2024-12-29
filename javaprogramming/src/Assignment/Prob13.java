package Assignment;

import java.util.Scanner;

public class Prob13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Gender (male or female) :");
		String gender = sc.nextLine();
		System.out.print("Enter your year of service: ");
		int service=sc.nextInt();
		sc.nextLine();//using this because the nextInt() takes only the digits and leave the space that appears after enter
		//so the next nextLine() function takes the blank line as input.To avoid this use nextLine() function after every nextInt()
		System.out.print("Enter the qualification(grad or postgrad) :");
		String qualification = sc.nextLine();
		sc.close();
		
		salary(gender,service,qualification);
	}

	public static void salary(String gender,int service,String qual) {
		if(gender.equals("male") ) {
			if(service >=10 && qual.equals("postgrad")) {
				System.out.println("Your salary is Rs.15,000");
			}else if(service >=10 && qual.equals("grad")) {
				System.out.println("Your salary is Rs.10,000");
			}else if(service <10 && qual.equals("postgrad")) {
				System.out.println("Your salary is Rs.10,000");
			}else if(service <10 && qual.equals("grad")) {
				System.out.println("Your salary is Rs.7,000");
		}
	}else if(gender.equals("female")) {
		if(service >=10 && qual.equals("postgrad")) {
			System.out.println("Your salary is Rs.12,000");
		}else if(service >=10 && qual.equals("grad")) {
			System.out.println("Your salary is Rs.9,000");
			
		}
		
		
	}else {
		System.out.println("Enter the valid gender");
	}
	}
}
