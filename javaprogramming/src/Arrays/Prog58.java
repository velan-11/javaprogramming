package Arrays;
//design a method to add plus one value to the last element of the array and return the array.


import java.util.*;

public class Prog58{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int c[]=plus_one(a);
		System.out.println(Arrays.toString(c));
		
		
	}
	public static int[]  plus_one(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) {
				count++;
			}
		}
		if(count==a.length ) {
			int b[]=new int[a.length+1];
			b[0]=1;
			return b;
		}

		for(int i=a.length-1;i>=0;i--) {
			if(a[i]<9) {
				a[i]+=1;
				return a;
			}
			a[i]=0;
			
		}
	
		
	
		return a;	
			
		
		
	}
}
