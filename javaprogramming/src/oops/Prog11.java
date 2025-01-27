package oops;
//House
import java.util.Scanner;

public class Prog11 {
	public static void main(String[] args) {
		House h1=new House();
		h1.initialize();
		h1.display();
		House h2=new House();
		h2.initialize();
		h2.display();
		House h3=new House();
		h3.initialize();
		h3.display();
		
	}

}
class House{
	String size;
	double cost;
	String floors;
	public void initialize() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=sc.nextLine();
		System.out.println("Enter the price:");
		cost=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the floors:");
		floors=sc.nextLine();
	}
	public void display() {
		System.out.println("size: "+size);
		System.out.println("Cost: "+cost);
		System.out.println("floors: "+floors);
	}
}
