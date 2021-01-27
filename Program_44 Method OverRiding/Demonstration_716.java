class A{
	public void msg1(){
		System.out.println("Class A: Public!");
	}
	private void msg2(){
		System.out.println("Class A: Private!");
	}
	protected void msg3(){
		System.out.println("Class A: Protected!");
	}
}
public class Demonstration_716 extends A{
	void msg(){
		System.out.println("Class Main: Welcome!");
	}
	public void msg1(){
		System.out.println("OverRiding public method!");
	}
	void msg2(){
		System.out.println("Overriding private method!");
	}
	public void msg3(){
		System.out.println("Overriding protected method!");
	}
	public static void main(String args[])
	{
		Demonstration_716 obj = new Demonstration_716();
		obj.msg();
		//obj.msg1();
		//obj.msg2();
		//obj.msg3();
	}
}