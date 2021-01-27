class Circle {
	double x,y;
	double r;
	double circumference() {
		return 2*3.14*r;
	}
	double area() {
		return 3.14*r*r;
	}
	Circle(double a,double b,double c){
		x=a;
		y=b;
		r=c;
	}
}
class Demonstration_38{
	public static void main(String... a)
	{
		Circle c1 = new Circle(3,4,5);
		Circle c2 = new Circle(-4,8,10);
		System.out.println("Circumference = "+c1.circumference());
		System.out.println("Area = "+c1.area());
		System.out.println("Circumference = "+c2.circumference());
		System.out.println("Area = "+c2.area());
	}
}