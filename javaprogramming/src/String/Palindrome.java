package String;
import java.lang.String;

public class Palindrome {
	public static void main(String[] args) {
		String s="hello";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}else
			System.out.println("not a palindrome");
	}
}
