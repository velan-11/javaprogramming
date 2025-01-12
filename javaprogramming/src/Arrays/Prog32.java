package Arrays;

import java.util.Scanner;

//to find the second minimum value in the array
public class Prog32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array:");
		int size=sc.nextInt();
		System.out.print("enter the elements of the array:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("enter the nth minimum you want to find:");
		int n=sc.nextInt();
		nth_minimum(a,n);
	}
public static void nth_minimum(int a[],int n) {
	for(int i=0;i<a.length-1;i++) {//pass
		for(int j=0;j<a.length-1-i;j++) {//swap
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println("The "+n+" minimum element is:"+a[n-1]);
}

}
