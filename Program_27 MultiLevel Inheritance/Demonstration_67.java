// MultiLevelStatement
class Box{
	private double width;
	private double height;
	private double depth;
	
	//Constructor used when all dimensions specified
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	
	//compute return volume
	double volume() {
		return width*height*depth;
	}
}
// Add weight
class BoxWeight extends Box{
	double weight;
	BoxWeight(double w, double h,double d,double m){
		super(w,h,d);
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	Shipment(double w, double h,double d,double m,double c){
		super(w,h,d,m);
		cost=c;
	}
}
class Demonstration_67{
	public static void main(String... ancncdienv){
	Shipment shipment1 = new Shipment(10,29,15,10,3.41);
	Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
	double vol;
	vol = shipment1.volume();
	System.out.println("Volume of Shipment1 is "+vol);
	System.out.println("Weight of shipment1 is "+shipment1.weight);
	System.out.println("Shipment cost: $" + shipment1.cost);
	System.out.println("");
	vol = shipment2.volume();
	System.out.println("Volume of Shipment2 is "+vol);
	System.out.println("Weight of shipment2 is "+shipment2.weight);
	System.out.println("Shipment cost: $" + shipment2.cost);
	}
}