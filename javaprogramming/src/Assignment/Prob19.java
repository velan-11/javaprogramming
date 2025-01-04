package Assignment;
//to check whether the given number is a magic number
import java.util.Scanner;

public class Prob19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int i = sc.nextInt();
		if(magic(i)) {
			System.out.println("it is a magic number");
		}else {
			System.out.println("it is not a magic number");
		}

	}
public static boolean magic(int i) {
	while(i>9) {
		int sum = 0;
		while(i!=0) {
			int rem=i%10;
			sum+=rem;
			i=i/10;
		}
		i=sum;
		}
	return i==1;
}
}
