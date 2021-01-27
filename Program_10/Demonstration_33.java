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
class Box{
	double width;
	double height;
	double depth;
	double area(){
		double a;
		 a=(width*height+height*depth+depth*width);
		 return a;
}
double volume(){
	double v;
	v=width*height*depth;
	return v;
	}
}

class Demonstration_33 {
	public static void main(String... a)
	{
		Circle c =new Circle();
		Box b =new Box();
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		b.width=3;
		b.height=4;
		b.depth=5;
		System.out.println("Circumference"+ c.circumference());
		System.out.println("Area"+ c.area());
		System.out.println("Area"+ b.area());
		System.out.println("Volume"+ b.volume());
	}
}