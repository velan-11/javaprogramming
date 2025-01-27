package String;
//to remove space at the start and end without using the inbuilt methods.
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.nextLine();
	removeSpaces(str);
	}

	private static void removeSpaces(String str) {
	int start = 0;
	int end = str.length() - 1;
	for (int i = 0; i < str.length() - 1; i++) {
	if (str.charAt(start) == ' '){
	start++;
	}
	if (str.charAt(end) ==' ') {
	end--;
	}
	}
	for (int i = start; i <= end; i++) {
	System.out.print(str.charAt(i));
}
	}
	}
	
