import java.io.*;
public class Demonstration_1210{
    public static void main(String... args) throws Exception{
       try{
            FileInputStream fin = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_90 Copying a file using ByteStreamClasses/output.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}