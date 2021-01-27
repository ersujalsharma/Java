import java.io.FileOutputStream;
public class Demonstration_122b {
    public static void main(String... adgib){
            byte cities[]={'D','E','L','H','I',' ','M','A','D','R','A','S',' ','L','O','N','D','O','N','\n'};
            FileOutputStream outfile = null;
        try{
            outfile = new FileOutputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_85 FileOutputStram/city.txt");
            outfile.write(cities);
            outfile.close();
            System.out.println("File writing is over....");
        }
        catch(Exception ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}