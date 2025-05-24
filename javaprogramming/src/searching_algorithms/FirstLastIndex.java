package searching_algorithms;

import java.util.Arrays;
import java.util.Scanner;

//to find the first and last index of the number
public class FirstLastIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target element:");
		int target=sc.nextInt();
		int b[]= {-1,-1};//if element is not found
		b[0]=binary(a,target,true);
		b[1]=binary(a,target,false); 
		System.out.println(Arrays.toString(b));

	}
	public static int binary(int a[],int target,boolean first) {
		int ans=-1;
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<a[mid]) {
				end=mid-1;
			}else if(target>a[mid]) {
				start=mid+1;
			}else {
				ans=mid;
				if(first) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
		}
		return ans;
		
	}
	
}
