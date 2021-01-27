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
class Demonstration_31 {
	public static void main(String... a)
	{
		Circle c =new Circle();
		c.x=0.0;
		c.y=0.0;
		c.r=5.0;
		System.out.println("Circumference"+ c.circumference());
		System.out.println("area"+ c.area());
	}
}