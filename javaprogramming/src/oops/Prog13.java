package oops;
// creating a user built array
public class Prog13 {
	public static void main(String[] args) {
		Cars[] c1=new Cars[5];
		Cars c2=new Cars("ji",12,122);
		c1[0]=c2;
		System.out.println(c1[0]);
	
	}
}
class Cars{
	String name;
	int cost;
	int model;
	public Cars(String name,int cost,int model) {
		this.name=name;
		this.cost=cost;
		this.model=model;
		}
	public String toString() {
		return this.name+" cost is "+this.cost+"and its model is"+this.model;
	}
}
