package patterns;
//A 3 4 5 6 
//3 B 5 6 7 
//3 4 C 6 7 
//3 4 5 D 7 
//3 4 5 6 E 
public class Prog27 {
	public static void main(String[] args) {
		pattern(5);
	}
	public static void pattern(int n) {
		char ch=65;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==col) {
					System.out.print(ch+++" ");
				}else {
					if(row==1)
						System.out.print(col+1+" ");
					else
						System.out.print(col+2+" ");
				}
			}System.out.println();
		}
	}
	

}
