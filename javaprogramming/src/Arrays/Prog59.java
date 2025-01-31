package Arrays;
//find the majority of the element that appears strictly more than arry size/2



import java.util.*;

public class Prog59{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(majority(a));
		
		
	}
	public static int majority(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				
			}
			if(count>a.length/2) {
				return a[i];
			}
			
		}
		
		return -1;
	}
	
}