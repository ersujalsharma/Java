import java.io.FileInputStream;
public class Demonstration_124 {
    public static void main(String... fhgiin){
        try{
            FileInputStream fin = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_87 FileInputStream Reading File/testout.txt");
            int i = fin.read();
            System.out.print((char)i);
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}