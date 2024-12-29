package Assignment;

//to check consonant or vowel
import java.util.Scanner;

public class Prob11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		String s = sc.nextLine();
		char ch = s.charAt(0);
		classify(ch);

	}

	public static void classify(char a) {
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
			switch (a) {
			case 'a':
			case 'e':

			case 'i':

			case 'o':

			case 'u':

			case 'A':

			case 'E':

			case 'I':

			case 'O':

			case 'U':
				System.out.println("It is a vowel");
				break;
			default:
				System.out.println("It is a consonant");

			}
		} else {
			System.out.println("dont enter other than alphabet");
		}
	}

}
