package oops;
//board
import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		board b1=new board();
		b1.initialize();
		b1.display();
		board b2=new board();
		b2.initialize();
		b2.display();
		board b3=new board();
		b3.initialize();
		b3.display();
		
	}

}
class board{
	String brand;
	double cost;
	String color;
	public void initialize() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand:");
		brand=sc.nextLine();
		System.out.println("Enter the price:");
		cost=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the color:");
		color=sc.nextLine();
	}
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Cost: "+cost);
		System.out.println("Color: "+color);
	}
}
