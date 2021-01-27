class BaseClass{
	public int x = 10;
	private int y = 10;
	protected int z = 10;
	int a = 10; // Implicit Default Access Modifier
public int getX(){
	return x;
}
public void setX(int x){
	this.x = x;
}
private int getY(){
	return y;
}
private void setY(int y){
	this.y = y;
}
protected int getZ(){
	return z;
}
protected void setZ(int z){
	this.z = z;
}
int setA(){
	return a;
}
void setA(int a){
	this.a = a;
}
}
public class Demonstration_715 extends BaseClass{
	public static void main(String... asfdijdbhvfbi){
		BaseClass rr = new BaseClass();
		rr.z = 0;
		Demonstration_715 subClassObj = new Demonstration_715();
		//Access Modifiers - public
		System.out.println("VAlue of x is : "+subClassObj.x);
		subClassObj.setX(20);
		System.out.println("Value of x is : "+subClassObj.x);
		/*Access MOdifier Private
		System.out.println("VAlue of y is : "+subClassObj.y);
		subClassObj.setY(20);
		System.out.println("Value of y is : "+subClassObj.y);
		*/
		//Access Modifier proteccted
		System.out.println("VAlue of z is : "+subClassObj.z);
		subClassObj.setZ(20);
		System.out.println("Value of z is : "+subClassObj.z);
		//Access Modifier Default
		System.out.println("VAlue of a is : "+subClassObj.a);
		subClassObj.setA(20);
		System.out.println("Value of a is : "+subClassObj.a);
		
	}
}