package Random_test_practice;

public class Chocolate {
public static void main(String[] args) {
	System.out.println(choco(5));
}
public static int choco(int n) {
	int choco=n*(n+1)/2;
	if(n%5==0) {
		choco=choco+2;
	}
	int a[]=new int[n+1];
	for(int i=0;i<a.length;i++) {
		a[i]=i+1;
	}
	for(int i=0;i<a.length-1;i++) {
		if(a[i]%5==0 && i+1==a.length) {
			choco=choco+2;
		}
		else if(a[i]%5==0 && i+1!=a.length) {
			choco=choco+4;
		}
	
	}
	return choco;
	
}
}
