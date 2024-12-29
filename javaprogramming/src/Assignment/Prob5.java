package Assignment;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		String s=sc.nextLine();
		char ch=s.charAt(0);
		special_char(ch);
	}
	public static void special_char(char a) {
		if(a>='A'&&a<='Z' || a>='a'&&a<='z' || a>='0' && a<='9') {
			System.out.println("This is not a special character");
		}else {
			System.out.println("This is a special character");
		}
	}

}
