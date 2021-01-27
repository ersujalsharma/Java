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
		x=a; y=b; r=c;
		}
	Circle(double c){
		x=0; y=0; r=c;
	}
	Circle(Circle c){
		x=c.x; y=c.y; r=c.r;
	}
	Circle(){
		x=0;y=0;r=1;
	}
}
class Demonstration_39{
	public static void main(String... a)
	{
		Circle c1 = new Circle(3,4,5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(c1);
		Circle c4 = new Circle();
		System.out.println("Circumference = "+c1.circumference());
		System.out.println("Area = "+c1.area());
		System.out.println("Circumference = "+c2.circumference());
		System.out.println("Area = "+c2.area());
		System.out.println("Circumference = "+c3.circumference());
		System.out.println("Area = "+c3.area());
		System.out.println("Circumference = "+c4.circumference());
		System.out.println("Area = "+c4.area());
	}
	}
