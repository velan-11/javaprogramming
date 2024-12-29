package Assignment;

import java.util.Scanner;

public class Prob8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		String s = sc.nextLine();
		char ch = s.charAt(0);
		check_char(ch);
	}

	public static void check_char(char a) {
		if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
			System.out.println("It is an alphabet");
		} else if (a >= '0' && a <= '9') {
			System.out.println("It is a digit");
		} else {
			System.out.println("It is a special character");
		}
	}

}
