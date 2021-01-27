import java.io.*;
class Demonstration_1211 {
    public static void main(String... args) throws Exception{
        FileInputStream input1=new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_93 Use of SequenceInputStream Class/input1.txt");
        FileInputStream input2=new FileInputStream("C:/Users/sujal.000/Desktop/Java_Nptel/Program_93 Use of SequenceInputStream Class/input2.txt");
        SequenceInputStream inst=new SequenceInputStream(input1,input2);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}