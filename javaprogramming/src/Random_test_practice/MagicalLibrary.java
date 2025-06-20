package Random_test_practice;

public class MagicalLibrary {
	public static void main(String[] args) {
		int a[][]= {{6,8,7},{1,4,3},{4,3,2}};
		
		System.out.println(magic(a));
	}
	public static int magic(int a[][]) {
		int magic=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2!=0)
					sum=sum+a[i][j];
				
			}
			if(sum%2==0) {
				magic++;
			}
		}
		return magic;
	}
}
