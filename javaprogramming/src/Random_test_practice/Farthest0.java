package Random_test_practice;
import java.util.Arrays;
import java.util.Scanner;
//this is wrong find the crt ans later

/*Find 0 with Farthest 1s in a Binary Array
Given a string (seats) of 1s and 0s, where 1 represents a filled seat and 0 represents an empty seat in a row. Find an empty seat with maximum distance from an occupied seat. Return the maximum distance.
Examples:
Input: Seats = "1000101"
Output: 2
Explanation: Geek can take 3rd place and have a distance of 2 in left and 2 in right.
Input: Seats = "1000"
Output: 3
Explanation: Geek can take the rightmost seat to have a distance of 3.*/


public class Farthest0 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(far(a));
	}
	public static int far(int a[]) {
		int index=0;
		int max_count=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]!=a[j]) {
					count++;
					if(count>max_count) {
						max_count=count;
						index=i;
				}else {
					count=0;
				}
			}
		}
	}
		return index;
}
}
