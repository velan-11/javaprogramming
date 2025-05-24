package searching_algorithms;
//find the smallest letter greater than the target(ceiling of a number)
import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		char a[]=new char[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next().charAt(0);
		}
		System.out.println("Enter the target element:");
		char target=sc.next().charAt(0);
		char ans=binary(a,target);
		System.out.println(ans);
	}
	public static char binary(char a[],char target) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<a[mid]) {
				end=mid-1;
				
			}
			else {// the else condition should be this only ,if the if condition is used as else the value will go to negative
				start=mid+1;
			}
			
		}
		return a[start%a.length];
	}
}
