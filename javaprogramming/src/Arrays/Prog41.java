package Arrays;

import java.util.Scanner;

//to find the second maximum value in the array
public class Prog41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("enter the elements of the array:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		second_maximum(a);
	}
public static void second_maximum(int a[]) {
	if(a.length==1) {
		System.out.println("There is no second maximum");
		return;
	}	
	int max=a[0];
	int max2=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max2=max;
			max=a[i];
	}
	}
	System.out.println("The second maximum value in the array is "+max2);

}
}
