package Arrays;
import java.util.*;
public class Prog47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		missing_element(a);
	}
	public static void missing_element(int a[]){
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				}
			if(a[i]<min) {
				min=a[i];
			}
			}
	int sum=0;
	for(int i=min;i<=max;i++) {
		sum=sum+i;
	}
	int sum_arr=0;
	for(int i=0;i<a.length;i++) {
		sum_arr=sum_arr+a[i];
	}
	int missing=sum-sum_arr;
	if(sum==sum_arr) {
		System.out.println(a[0]-1);
	}else {
		System.out.println(missing);
		}
	}
	
	
	
}
