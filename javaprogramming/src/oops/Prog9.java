package oops;
//Animal
import java.util.Scanner;

public class Prog9 {
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.initialize();
		a1.display();
		Animal a2=new Animal();
		a2.initialize();
		a2.display();
		Animal a3=new Animal();
		a3.initialize();
		a3.display();
		
	}

}
class Animal{
	String Name;
	double size;
	String color;
	public void initialize() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		Name=sc.nextLine();
		System.out.println("Enter the price:");
		size=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the color:");
		color=sc.nextLine();
	}
	public void display() {
		System.out.println("Name: "+Name);
		System.out.println("size: "+size);
		System.out.println("Color: "+color);
	}
}
