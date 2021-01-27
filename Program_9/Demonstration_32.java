class Circle {
	double x,y;
	double r;
	double circumference(){
		return 2*3.14*r;
	}
	double area(){
		return r*22/7*r;
	}
}
class Demonstration_32 {
	public static void main(String... a)
	{
		Circle c1 =new Circle();
		Circle c2 =new Circle();
		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;
		c2.x=-4.0;
		c2.y=-8.0;
		c2.r=10.0;
		System.out.println("Circumference"+ c1.circumference());
		System.out.println("area"+ c1.area());
		System.out.println("Circumference"+ c2.circumference());
		System.out.println("area"+ c2.area());
	}
}