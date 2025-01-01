package Assignment;

import java.util.Scanner;

//to get date day month from user and return the day.(own assignment)
//there are some errors in the program
public class Prob18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date:");
		int date=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the month:");
		String month=sc.nextLine();
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		
		
		
		week_of_day(date,month,year);
		sc.close();

	}
	public static void week_of_day(int date,String month,int year) {
		int a=year%100;
		int b=a/4;
		int c=0;
		int d=0;
		if(year>=1600 && year<1700) {
			c=6;
		}else if(year>=1700 && year<1800) {
			c=4;
		}else if(year>=1800 && year<1900) {
			c=2;
		}else if(year>=1900 && year<2000) {
			c=0;
		}else if(year>=2000 && year<2100) {
			c=6;
		}else {
			System.out.println("The year range is between 1600 - 2100");
		}
		switch(month) {
		case "January":d=0;break;
		case "February":d=3;break;
		case "March":d=3;break;
		case "April":d=6;break;
		case "May":d=1;break;
		case "June":d=4;break;
		case "July":d=6;break;
		case "August":d=2;break;
		case "September":d=5;break;
		case "October":d=0;break;
		case "November":d=3;break;
		case "December":d=5;break;
			
		}
		int w=((a+b+c+d+date)/7)+1;
		switch(w) {
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		default:System.out.println("bye bye bye");
		}
		
		
		
	}
}
