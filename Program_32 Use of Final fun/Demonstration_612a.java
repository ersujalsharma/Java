abstract class Base{
	final void fun(){System.out.println("Final fun() is called");}
}
class Derived extends Base {}

class Demonstration_612a {
	public static void main(String... adnjsnv){
		Base b = new Derived();
		b.fun();
	}
	
	
}