package Assignment;

import java.util.Scanner;

/*12. Given the length and breadth of a rectangle, a program to find
whether the area of the rectangle is greater than its perimeter or not. for
example, (lie area of the rectangle S and is greatest
than its perimeter*/
public class Prob3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth: ");
		int b=sc.nextInt();
		System.out.println("Enter the height: ");
		int h=sc.nextInt();
		int area=area(b,h);
		int perimeter=perimeter(b,h);
		if(area>perimeter) {
			System.out.println("The area of rectangle is greater than perimeter");
		}else {
			System.out.println("The area of rectangle is lesser than perimeter");
		}
		
		
	}
	public static int area(int b,int h) {
		return b*h;
	}public static int perimeter(int b,int h) {
		return 2*(b+h);
	}
	

}
