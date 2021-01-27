abstract class Base {
	Base() {System.out.println("Base Constructor is callled");}
	abstract void fun();
}

class Derived extends Base{
	Derived() {
		super();
		System.out.println("Derived Constructor is called");}
	
	void fun(){ System.out.println("Derived fun is called");}
}
class Demonstration_69 {
	public static void main(String... absuhbadkbvf){
		Derived d =new Derived();
		d.fun();
	}
}