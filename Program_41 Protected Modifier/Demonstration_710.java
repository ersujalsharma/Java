class A {
	protected int rollNo = 555;
	protected void msg(){
		System.out.println("Class A: Hello Java!"+rollNo);
	}
}
class Demonstration_710{
	public static void main(String... ajdnfinsc){
		A obj = new A();
		obj.msg();
		System.out.println("class A: Hello JAva!"+obj.rollNo);
	}
}