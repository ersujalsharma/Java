class Point {
	int x,y;
	void getPoint(int a,int b) {
		x=a;
		y=b;
	}
}
class Demonstration_35
{
	float distance;
	public static void main(String... a) {
		Point p1 = new Point();
		Point p2 = p1;
		Point p3 = new Point();
		Point p4 = new Point();
		p1.getPoint(5,10);
		p2.getPoint(15,20);
		p3.getPoint(20,30);
		p4.getPoint(30,40);
		System.out.println("x = "+p1.x);
		System.out.println("y = "+p1.y);
		System.out.println("x = "+p2.x);
		System.out.println("y = "+p2.y);
	}
}