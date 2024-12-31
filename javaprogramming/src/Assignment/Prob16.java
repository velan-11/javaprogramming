package Assignment;

import java.util.Scanner;

/*6)Create a program that calculates the final price of an item based on its original price and
a discount percentage. The discount percentage varies depending on the original price
price >1000price <3000 discount -10%
price >=3000 and price<6000-20%
price >=6000 discount 40
price<1000 no discount */
public class Prob16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price of your items: ");
		double price=sc.nextDouble();
		System.out.println(discount(price));
		
		
	}
	public static double discount(double price) {
		if(price>1000 && price<3000) {
			double discount=price*(10.0/100);
			return price-discount;
		}else if(price>=3000 && price<6000) {
			double discount=price*(20.0/100);
			return price-discount;
		}else if(price>=6000) {
			double discount=price*(40./100);
			return price-discount;
		}else {
			return price;
		}
	}

}
