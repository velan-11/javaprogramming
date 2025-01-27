package oops;
//Mic
import java.util.Scanner;

public class Prog10 {
	public static void main(String[] args) {
		Mic m1=new Mic();
		m1.initialize();
		m1.display();
		Mic m2=new Mic();
		m2.initialize();
		m2.display();
		Mic m3=new Mic();
		m3.initialize();
		m3.display();
		
	}

}
class Mic{
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
