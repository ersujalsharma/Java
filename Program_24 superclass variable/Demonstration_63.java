class Box {
	double width;
	double height;
	double depth;
	
	Box(){
	}
	
	Box(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}
//Here, Box is extended to include weight.
class BoxWeight extends Box {
	double weight;
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}
class Demonstration_63 {
	public static void main(String... abcd){
		BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
		Box plainbox = new Box();
		double vol;
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is "+ weightbox.weight);
		System.out.println();
		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("Volume of box is "+ vol);
		
	}
}