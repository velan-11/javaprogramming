package searching_algorithms;
import java.util.*;
public class Binary_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target element:");
		int target=sc.nextInt();
		int ans=binary(a,target);
		System.out.println(ans);
	}
	public static int binary(int a[],int target) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(a[mid]<target) {
				start=mid+1;
			}
			else if(a[mid]>target) {
				end=mid-1;
			}
			else {
				
				return mid;
			}
		}
		return -1;
	}
}
