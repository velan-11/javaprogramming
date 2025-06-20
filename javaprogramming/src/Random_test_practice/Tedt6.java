package Random_test_practice;
//
import java.util.Scanner;

public class Tedt6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(count_block(a));
	}

	public static int count_block(int a[]) {
		
		int max_count=0;
		for(int i=2;i<11;i++) {
			int count=0; 
			int no_count=0;
		
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
					if(count>1) {
						no_count=count;
					}
				}else {
					count=0;
				}
}
			if(no_count==i) {
				max_count++;
}
}
		return max_count;
	}
}