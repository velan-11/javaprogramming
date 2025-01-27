package oops;
//design a class for employee with minimum three states create three objects and initialize the states
public class Prog2 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Velumurugan";
		e1.emp_id=12;
		e1.emp_service=5;
		e1.to_display();
		Employee e2=new Employee();
		e2.name="Vairam";
		e2.emp_id=123;
		e2.emp_service=99;
		e2.to_display();
		Employee e3=new Employee();
		e3.name="Vasee";
		e3.emp_id=873;
		e3.emp_service=50000;
		e3.to_display();
	}


}
class Employee{
	String name;
	int emp_id;
	int emp_service;
	public void to_display() {
		System.out.println("Name: "+name);
		System.out.println("Employee id: "+emp_id);
		System.out.println("Year of Service: "+emp_service);
	}
}
