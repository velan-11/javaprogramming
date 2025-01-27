package oops;
//pen
import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.initialize();
		p1.display();
		Pen p2=new Pen();
		p2.initialize();
		p2.display();
		Pen p3=new Pen();
		p3.initialize();
		p3.display();
		
	}

}
class Pen{
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
