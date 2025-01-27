package oops;
//bike
import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.initialize();
		b1.display();
		Bike b2=new Bike();
		b2.initialize();
		b2.display();
		Bike b3=new Bike();
		b3.initialize();
		b3.display();
		
	}

}
class Bike{
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
