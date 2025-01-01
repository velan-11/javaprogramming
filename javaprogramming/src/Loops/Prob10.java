package Loops;
//to print all the upper case and lower case alphabets
public class Prob10 {
	public static void main(String[] args) {
		char i='A';
		System.out.println("The upper case alphabets are: ");
		while(i<'z') {
			if(i==91) {
				System.out.println("The lower case alphabets are:");
				i='a';
			}
			System.out.println(i+": "+(int)i);
			i++;
		}
	}
}
