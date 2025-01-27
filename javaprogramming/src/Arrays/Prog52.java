package Arrays;
//to move the negative elements to first of the array
import java.util.*;
 
public class Prog52 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int size=sc.nextInt();
	System.out.print("enter the array elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	move_negative(a);

}
public static void move_negative(int a[]) {
	int b[]=new int[a.length];
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]<0) {
			b[j++]=a[i];
		}
			
}	
	for(int i=0;i<a.length;i++) {
		if(a[i]>=0) {
			b[j++]=a[i];
		}
}
	System.out.println(Arrays.toString(b));

}
}