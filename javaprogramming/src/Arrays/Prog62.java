package Arrays;
//to find  the maximum number of consecutive ones in the array.
import java.util.Scanner;

public class Prog62 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("enter the array elements:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		con_no(a);
		
		
	}
	public static void con_no(int a[]) {
		int count=0;
		int max_seq=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
				if(max_seq<=count) {
					max_seq=count;
				}
			}else {
				count=0;
			}
			}
		System.out.println(max_seq);
		}
}