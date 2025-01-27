package oops;
//Bus
import java.util.Scanner;

public class Prog8{
	public static void main(String[] args) {
		Bus b1=new Bus();
		b1.initialize();
		b1.display();
		Bus b2=new Bus();
		b2.initialize();
		b2.display();
		Bus b3=new Bus();
		b3.initialize();
		b3.display();
		
	}

}
class Bus{
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
