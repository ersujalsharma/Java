abstract class Base {
	void fun()	{System.out.println("Base Constructor is callled");}
}

class Derived extends Base{
	Derived() {	System.out.println("Derived Constructor is called");}
	
	void fun(){ System.out.println("Derived fun is called");}
}
class Demonstration_610 {
	public static void main(String... absuhbadkbvf){
		Derived d =new Derived();
		d.fun();
	}
}