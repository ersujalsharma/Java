abstract class Base {
	abstract void fun();
}
class Derived extends Base{
	void fun(){ System.out.println("Derived fun is called");}
}
class Demonstration_68 {
	public static void main(String... absuhbadkbvf){
		Base b =new Derived();
		b.fun();
	}
}