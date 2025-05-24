package Random_test_practice;

public class fibo {
	public static void main(String[] args) {
		int n=0;
		int n1=1;
		for(int i=1;i<500;i++) {
			int sum=n+n1;
			if(sum>5000) {
				break;
			}
			n=n1;
			n1=sum;
			
	}
		System.out.println(n1+" "+n);
		while(n>500) {
			int diff=n1-n;
			if(diff<500) {
				break;
			}
			System.out.println(diff);
			n1=n;
			n=diff;
		}
}
}
