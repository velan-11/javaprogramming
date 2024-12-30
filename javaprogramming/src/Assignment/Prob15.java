package Assignment;

import java.util.Scanner;

public class Prob15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current year:");
		int current = sc.nextInt();
		System.out.println("Enter the year you joined:");
		int year = sc.nextInt();
		System.out.println("enter you basic salary");
		double salary = sc.nextDouble();
		gross_salary(current, year, salary);

	}

	public static void gross_salary(int current, int year, double salary) {
		if (salary <= 10000) {
			if (current - year > 3) {
				double gros = salary + salary * (20.0 / 100) + salary * (80.0 / 100);
				gros = gros + 2500;
				System.out.println("Your Gross salary: " + gros);

			} else {
				double gros = salary + salary * (20.0 / 100) + salary * (80.0 / 100);
				System.out.println("Your Gross salary: " + gros);
			}
		} else if (salary > 10000 && salary <= 20000) {
			if (current - year > 3) {
				double gros = salary + salary * (25.0 / 100) + salary * (90.0 / 100);
				gros = gros + 2500;
				System.out.println("Your Gross salary: " + gros);

			} else {
				double gros = salary + salary * (25.0 / 100) + salary * (90.0 / 100);
				System.out.println("Your Gross salary: " + gros);
			}

		} else if (salary > 20000) {
			if (current - year > 3) {
				double gros = salary + salary * (30.0 / 100) + salary * (95.0 / 100);
				gros = gros + 2500;
				System.out.println("Your Gross salary: " + gros);

			} else {
				double gros = salary + salary * (30.0 / 100) + salary * (95.0 / 100);
				System.out.println("Your Gross salary: " + gros);
			}

		} else {
			System.out.println("Enter a valid inputs");
		}

	}
}