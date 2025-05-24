package searching_algorithms;
//this will cause an error if it is not an infinite array
import java.util.Scanner;
public class InfiniteArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {3,5,7,9,10,90,100,130,140,160,170};
		System.out.println("Enter the target element:");
		int target=sc.nextInt();
		ans(a,target);
	}
		public static void ans(int a[],int target) {
			int start=0;
			int end=1;
			while(target>a[end]) {
				int NewStart=end+1;//using here newstart becoz in the next step we need old start value;
				end=end+(end-start+1)*2;//doubling the box value
				start=NewStart; 
			}
			
			System.out.println(binary(a,target,start,end));
			
		}
	
	public static int binary(int a[],int target,int start,int end) {
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(a[mid]<target) {
				start=mid+1;
			}
			else if(a[mid]>target) {
				end=mid-1;
			}
			else {
				
				return mid;
			}
		}
		return -1;
	}
}

