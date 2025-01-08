package Arrays;
//to print the sum of the second half of the array
import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array:");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		second_half(a);

	}
public static void second_half(int a[]) {
	int sum=0;
	
	for(int i=a.length/2;i<a.length;i++){
		sum+=a[i];
	}
	System.out.println("The sum of Second half of your given array is "+sum);
}
}
