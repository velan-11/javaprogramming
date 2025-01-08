package Arrays;
//to print the first half and second half of the array 
import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array:");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		first_half(a);

	}
public static void first_half(int a[]) {
	System.out.println("first half of your given array is ");
	for(int i=0;i<(a.length)/2;i++){
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Second half of your given array is ");
	for(int i=a.length/2;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
}
