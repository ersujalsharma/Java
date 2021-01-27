import java.io.*;
class Demonstration_128 {
    public static void main(String... args){
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        byte byteRead;
        try{
            infile = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_90 Copying a file using ByteStreamClasses/input.txt");
            outfile = new FileOutputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_90 Copying a file using ByteStreamClasses/output.txt");
            byteRead = (byte)infile.read();
            while(byteRead != -1){
                outfile.write(byteRead);
                byteRead = (byte)infile.read();
            }
        }  catch(FileNotFoundException e){
            System.out.println("fiLE noT foUND");
            
        }  catch(IOException t){
            System.out.println(t);
        }
        
    }
}