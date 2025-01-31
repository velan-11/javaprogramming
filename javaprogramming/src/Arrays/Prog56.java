package Arrays;

/*to find the maxiumum difference in the array.The larger value should come after smaller value;*/
import java.util.Scanner;

public class Prog56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		max_diff(a);
		
		
	}
	public static void max_diff(int a[]) {
		int max_d=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]-a[i]>max_d) {
					if(j>i) {
						max_d=a[j]-a[i];
					}
				}
			}
		}
		System.out.println(max_d);
	}
}