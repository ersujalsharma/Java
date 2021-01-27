import java.io.*;
public class Demonstration_129{
    public static void main(String... args) throws Exception{
        FileOutputStream fout = new FileOutputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_90 Copying a file using ByteStreamClasses/output.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s="Welcome to Nptel!";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}