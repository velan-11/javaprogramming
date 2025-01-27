package oops;
//flower
import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Flower f1=new Flower();
		f1.initialize();
		f1.display();
		Flower f2=new Flower();
		f2.initialize();
		f2.display();
		Flower f3=new Flower();
		f3.initialize();
		f3.display();
		
	}

}
class Flower{
	String type;
	double cost;
	String color;
	public void initialize() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type:");
		type=sc.nextLine();
		System.out.println("Enter the price:");
		cost=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the color:");
		color=sc.nextLine();
	}
	public void display() {
		System.out.println("type: "+type);
		System.out.println("Cost: "+cost);
		System.out.println("Color: "+color);
	}
}
