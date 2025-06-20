package Random_test_practice;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int a[]= {1,2};				
		System.out.print(check_array(a));
		
	}
	public static boolean check_array(int a[]) {
		Arrays.sort(a);
		int max=a[a.length-1];
		if(a.length<max+1) {
			return false;
		}
		int b[]=new int[a.length];
		int j=0;
		for(int i=1;i<=max;i++) {
			b[j++]=i;
		}
		b[b.length-1]=max;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		if(count==a.length) {
			return true;
		}
		return false;
	}
}
