package Arrays;
//to find the maximum value in an array
import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array:");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		minimum(a);

	}
public static void minimum(int a[]) {
		int x=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<x) {
				x=a[i];
			}
				}
		System.out.println("The maximum value is "+x);
	
}
}
