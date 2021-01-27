import java.io.FileInputStream;
public class Demonstration_125 {
    public static void main(String... fhgiin){
        try{
            FileInputStream fin = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_87 FileInputStream Reading File/testout.txt");
            int i = 0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}