class A{
	private int data=40;
	public void msg(){
		System.out.println("Class A: Hello Java!"+ data);
	}
}

public class Demonstration_78{
	public static void main(String... ajfndin){
		//private int data2 = 100;
		//public int data2 = 100;
		int data2 = 100;
		A obj = new A();
		System.out.println("class B:"+data2);
		obj.msg();
	}
}