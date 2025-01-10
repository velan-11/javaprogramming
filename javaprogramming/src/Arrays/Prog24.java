package Arrays;

import java.util.Scanner;

//to find the second minimum value in the array
public class Prog24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("enter the elements of the array:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		second_minimum(a);
	}
public static void second_minimum(int a[]) {
	for(int i=0;i<a.length-1;i++) {//pass
		for(int j=0;j<a.length-1-i;j++) {//swap
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	System.out.println("The second minimum element is:"+a[1]);
}

}
