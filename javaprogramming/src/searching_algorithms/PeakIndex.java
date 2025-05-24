//find the peak index in the mountain array
//note: this will also work when the array array contains multiple peak indices
package searching_algorithms;

import java.util.Scanner;

public class PeakIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int c=peakindex(a);
		System.out.println(c);

}
	public static int peakindex(int a[]) {
		int start=0;
		int end=a.length-1;
		while(start<end) {// when start and end points toward a number that is the answer
			int mid=start+(end-start)/2;
			if(a[mid]>a[mid+1]) {
				end=mid; //mid may also be the possible ans but we need to check further 
			}else {        
				start=mid+1; //this is when a[mid]<a[mid+1]
			}
		}
	 return start;// we can also return end
	}
}