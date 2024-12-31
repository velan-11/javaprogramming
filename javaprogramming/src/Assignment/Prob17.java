package Assignment;

import java.util.Scanner;

//create a program that prints the corresponding day of the week (e.g., i • Sunday, 2 •
//Monday, etc.
public class Prob17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the interger: ");
		int day=sc.nextInt();
		day(day);
	}
public static void day(int day) {
	if(day<=0 || day>7) {
		System.out.println("Enter the integer between 1 and 7");
	}else {
		switch(day) {
		case 1:System.out.println("SUNDAY");break;
		case 2:System.out.println("MONDAY");break;
		case 3:System.out.println("TUESDAY");break;
		case 4:System.out.println("WEDNESDAY");break;
		case 5:System.out.println("THURSDAY");break;
		case 6:System.out.println("FRIDAY");break;
		case 7:System.out.println("SATURDAY");break;
		
		}
	}
}
}
