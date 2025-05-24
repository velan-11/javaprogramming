package searching_algorithms;

import java.util.Scanner;

//given the target element the array may contain duplicate elements find the least index element
//this can be done using order agnostic binary search
/*HOW TO SOLVE THIS
 *FIRST FIND THE PEAK INDEX IN THE MOUNTAIN ARRAY SINCE IN MOUNTAIN ARRAY FIRST HALF WILL BE
 *IN ASCENDING ORDER AND SECOND HALF WILL BE IN THE DESCENDING ORDER.
 *
 *AFTER FINDING THE PEAK INDEX PASS THE START VALUE AND END VALUE(PEAK INDEX) TO ORGER AGNOSTIC BINARY
 *SEARCH.IF THE TARGET ELEMENT FOUND RETURN IT SINCE WE NEED THE LOWEST INDEX VALUE
 *
 *IF NOT FOUND THEN PASS THE NEXT HALF OF THE ARRAY.THE DESCENDING PART OF ORDER AGNOSTIC BINARY WILL
 *BE EXECUTED.
 *
 *NOTE:THIS IS A HARD LEVEL LEETCODE PROBLEM*/


public class inMountainArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the target element:");
		int target = sc.nextInt();
		System.out.println(ans(a, target));
	}
	

	public static int ans(int a[], int target) {
		int peak = peakindex(a);
		int b = binary(a, target, 0, peak);
		if (b != -1) {
			return b;
		}
		return binary(a, target, peak + 1, a.length - 1);

	}

	public static int binary(int a[], int target, int start, int end) {
		boolean b = a[start] < a[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == target) {
				return mid;

			}
			if (b) {
				if (a[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (a[mid] > target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	public static int peakindex(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {// when start and end points toward a number that is the answer
			int mid = start + (end - start) / 2;
			if (a[mid] > a[mid + 1]) {
				end = mid; // mid may also be the possible ans but we need to check further
			} else {
				start = mid + 1; // this is when a[mid]<a[mid+1]
			}
		}
		return start;// we can also return end
	}

}
