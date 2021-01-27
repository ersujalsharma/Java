import java.io.FileOutputStream;
public class Demonstration_123 {
    public static void main(String... alkjhidhv){
        try{
            FileOutputStream fout = new FileOutputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_86 FIleOutputStream Copying a File/testout.txt");
            String s = "Welcome to NPTEL! Hope you are enjoying Java Programming";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("File Copying is over...");
        }catch(Exception e){
            System.out.print(e);
        }
    }
}