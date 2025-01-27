package Arrays;
import java.util.*;
//to print all the missing elements in the array
//first method
public class Prog48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		missing_elements(a);
	}public static void missing_elements(int a[]) {
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
		for(int i=min;i<=max;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println(i);
			}
			
		}
		}
	}