import myInterface.*;
public class Demonstration_913{
    public static void main(String... aijgb){
        Geometry [] geoObject = new Geometry[3];
        geoObject [0] = new Circle(2.0);
        geoObject [1] = new Rectangle(1.0,3.0);
        geoObject [2] = new Ellipse(4.0,2.0);
        
        double totalArea = 0;
        for (int i=0;i<3;i++){
            totalArea = totalArea+geoObject[i].area();
        }
        System.out.println("Total Are of geo-Object is "+totalArea);
    }
}