package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//To remove the odd index elements in the array
public class Prog36{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		System.out.println("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
	}
		int b[]=odd_index(a);
		System.out.println(Arrays.toString(b));

	}
	public static int[] odd_index(int[] a) {
		int b[]=new int[a.length-a.length/2];
		for(int i=0,j=0;i<a.length;i++) {
			if(i%2==0) {
				b[j++]=a[i];
			}
		}
		return b;
			
		
	

}
	}

