import java.io.FileOutputStream;
public class Demonstration_122a {
    public static void main(String... adgib){
        try{
            FileOutputStream fout = new FileOutputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_85 FileOutputStram/test.txt");
            fout.write(65);
            fout.close();
            System.out.println("File writing is over....");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}