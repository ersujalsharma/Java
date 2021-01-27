import java.io.*;
class Demonstration_1212 {
    public static void main(String... args) throws IOException{
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null;
        file1 = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_93 Use of SequenceInputStream Class/input1.txt");
        file2 = new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_93 Use of SequenceInputStream Class/input2.txt");
        file3 = new SequenceInputStream(file1,file2);
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
        int ch;
        while((ch = inBuffer.read())!=-1){
            outBuffer.write((char)ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
    }
    
}