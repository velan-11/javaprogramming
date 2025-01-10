package Arrays;
import java.util.Scanner;
// to reverse an array within the given index value
public class Prog26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter the two index values to reverse");
	System.out.print("first index:");
	int i1=sc.nextInt();
	System.out.print("end index:");
	int i2=sc.nextInt();
			
	System.out.print("Before reversing:");
	print(a);
	reverse(a,i1,i2);
	
	System.out.print("\nAfter reversing:");
	print(a);
	
	
	
}
public static void reverse(int a[],int b,int c) {
	for(int i=c, j=b;i>j;i--,j++) {
			
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
}	
}
public static void print(int a[]) {
	for(int i:a) {
System.out.print(i+" ");

}
}
}