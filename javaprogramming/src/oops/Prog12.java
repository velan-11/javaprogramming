package oops;

public class Prog12 {
	int a=display();//single line initializer
	int b=sample();//single line initializer
	{
		System.out.println("Nalla irupom Nall irupom");//multi-line initializer
	}
	Prog12(){
		System.out.println("This is no arg constructor");
	}
	public int display() {
		System.out.println("This is display method");
		return 10;
	}{
		System.out.println("Ellarum Nalla irupom");//multi-line initializer
	}
	Prog12(int a,int b){
		System.out.println("int(a,b)");
	}
	public int sample() {
		System.out.println("This is sample method");
		return 20;
	}
	
	
	public static void main(String[] args) {
		Prog12 p=new Prog12();
		Prog12 p1=new Prog12(10,20);
	}

}
