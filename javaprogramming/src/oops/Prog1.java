package oops;
//to a class for a object car with 3 states.create 3 car objects.assign the values for states ad print the values;
public class Prog1 {
	public static void main(String[] args) {
		Car obj1=new Car();
		obj1.name="Benz";
		obj1.model="c220d";
		obj1.fuel_type="diesel";
		System.out.println(obj1.name);
		System.out.println(obj1.model);
		System.out.println(obj1.fuel_type);
		Car obj2=new Car();
		obj2.name="Audi";
		obj2.model="R8";
		obj2.fuel_type="hybrid";
		System.out.println(obj2.name);
		System.out.println(obj2.model);
		System.out.println(obj2.fuel_type);
		Car obj3=new Car();
		obj3.name="Suzuki";
		obj3.model="Swift";
		obj3.fuel_type="diesel";		
		System.out.println(obj3.name);
		System.out.println(obj3.model);
		System.out.println(obj3.fuel_type);
			
		
		
		
	}
}
	class Car{
		String name;
		String model;
		String fuel_type;
	}

