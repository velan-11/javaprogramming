package Assignment;
import java.util.*;
//
public class Prog21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n range:");
		int n=sc.nextInt();
		System.out.println("enter the m");
		int m=sc.nextInt();
		distinct(m,n);
	}
	public static void distinct(int m,int n) {
		int sum=0;
		int sum1=0;
		for(int i=1;i<=n;i++) {
			if(i%m==0) {
				sum=sum+i;
			}else {
				sum1=sum1+i;
			}
		}
		System.out.println(sum-sum1);
		}
}
