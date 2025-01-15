package Loops;
//to reverse a number for given test case: like---> 4321=2143
//this can be also done by concatenating
import java.util.Scanner;

public class Prog19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		reverse(num);

	}

	public static void reverse(int n){
        int count=0;
        int temp=n;
        while(temp!=0){
            count++;
            temp/=10;
        }
        count=count/2;
        int prd=1;
        while(count>0){
            prd=prd*10;
            count--;
        }
        int first=n/prd;
        int last=n%prd;
//      String reversed=last+""+first;
        int reversed=last*prd+first;
        System.out.println(reversed);
    }
}