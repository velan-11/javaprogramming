package oops;

import java.util.Scanner;

/*Design a class for a object and initialize the state of the object
using Non-static method and display the states using non static
method-->? separate method to initialize and to display*/
public class Prog3 {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.initialize();
		b1.display();
		Bag b2=new Bag();
		b2.initialize();
		b2.display();
		Bag b3=new Bag();
		b3.initialize();
		b3.display();
	}

}
class Bag{
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
