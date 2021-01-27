class A{
	int i;
	protected int j;
	void setij(int x,int y){
		i = x;
		j = y;
	}
}
class B extends A { //       Use of Inheritence illustration
	int total;
	void sum(){
		total = i+j;
	}
}
class Demonstration_714{
	public static void main(String... advfv){
		B B1 = new B();
		B1.sum();
	}
}