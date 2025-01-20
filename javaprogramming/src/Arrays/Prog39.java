package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//to remove an element from the array (if the element is repeating)
public class Prog39{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.print("Enter the element you want remove:");
	int ele=sc.nextInt();
	int[] b=remove(a,ele);
	System.out.print(Arrays.toString(b));
	
	
	
}
public static int[] remove(int a[],int ele) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==ele)
			count++;
	}
	int b[]=new int[a.length-count];	
	for(int i=0,j=0;i<a.length;i++) {
		if(a[i]!=ele) {
			b[j++]=a[i];
		}
	
}
	return b;

	}
}