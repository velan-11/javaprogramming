package Arrays;

import java.util.Scanner;

//to remove an element from the array
public class Prog21{
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
	remove(a,size,ele);
	
	
}
public static void remove(int a[],int size,int ele) {
	int b[]=new int[size-1];
	int x=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i]==ele) {
			x=i;
			break;
		}
		
}if(x==-1) {
	System.out.println("the element is not in the array");
	return;
}
	for(int i=0,j=0;i<a.length;i++) {
	if(i==x)
		continue;
	b[j++]=a[i];
}
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]+" ");
}

	}
}