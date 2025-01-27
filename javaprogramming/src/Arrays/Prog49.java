package Arrays;
import java.util.*;
//to print all the missing elements in the array
//second method
public class Prog49 {
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
		int b[]=new int[max];
		for(int i=min,j=0;i<=max;i++) {
			b[j++]=i;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					b[j]=Integer.MAX_VALUE;
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=Integer.MAX_VALUE) {
				System.out.println(b[i]);
			}
		}
		}
	}