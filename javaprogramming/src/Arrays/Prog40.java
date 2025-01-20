package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//to add element in the third array by sorting the elements in array1 and array2
public class Prog40{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array1: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.print("enter the size of the array2: ");
	int size2=sc.nextInt();
	int b[]=new int[size2];
	System.out.println("enter the elements");
	for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
	}
	int[] c =sort_newArray(a,b);
	System.out.println(Arrays.toString(c));
	
	
	
	
}
public static int[] sort_newArray(int a[],int b[]) {
	int c[]=new int[a.length+b.length];
	int i=0,j=0,k=0;
	while(i<a.length && j<b.length) {
		if(a[i]<b[j]) {
			c[k]=a[i];
			k++;
			i++;
		}else {
			c[k]=b[j];
			k++;
			j++;
		}

		
	}
	while(i<a.length) {
		c[k++]=a[i++];
	}
	while(j<b.length) {
		c[k++]=b[j++];
	}
	return c;
	}
}