package Assignment;

import java.util.Scanner;

public class Prob6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		String s=sc.nextLine();
		char ch=s.charAt(0);
		special_char(ch);
	}
	public static void special_char(char a) {
		if(a>='A'&&a<='Z') {
			System.out.println("It is an uppercase letter");
		}else {
			System.out.println("It is not an uppercase letter");
		}
	}

}
