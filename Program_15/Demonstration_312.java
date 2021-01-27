class A{
	void m(){
		System.out.println("Hello m!");
	}
	void n(){
		System.out.println("Hello n!");
	this.m();
	}
}
class Demonstration_312{
	public static void main(String... abc)
	{
		A a=new A();
		a.n();
	}
}