package Assignment;

import java.util.Scanner;

//to find the number of notes in the given amount
public class Prob2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount=sc.nextInt();
		System.out.println("Enter the note you want to count: ");
		int note=sc.nextInt();

		System.out.println(notes(amount,note));
		
	}
	public static int notes(int amount,int note) {
		int no_of_notes=amount/note;
		return no_of_notes;
		
	}
}
