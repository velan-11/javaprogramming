package Arrays;
//to remove the prime numbers from the array;
import java.util.*;

public class Prog46 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the array elements:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	remove_prime(a);
}
public static void remove_prime(int a[]) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		int count1=0;
		for(int j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
				count1++;
			}
		}
		if(count1==2) {
			count++;
			
		}
	}
	int b[]=new int[a.length-count];
	for(int i=0,k=0;i<a.length;i++) {
		int count1=0;
		for(int j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
				count1++;
			}
		}
		if(count1>2) {
			b[k++]=a[i];
			
		}
}
	System.out.println(Arrays.toString(b));
}
}
