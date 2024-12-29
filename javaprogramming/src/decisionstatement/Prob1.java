package decisionstatement;
import java.util.*;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a%10==0)
			System.out.println("The number ends with 0");
		else
			System.out.println("The number does not end with zero");

}
}
