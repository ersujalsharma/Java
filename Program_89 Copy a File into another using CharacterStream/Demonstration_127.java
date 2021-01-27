import java.io.*;
class Demonstration_127 {
    public static void main(String... args){
        File inFile = new File("C:/Users/sujal.000/Desktop/Java_Nptel/Program_89 Copy a File into another using CharacterStream/input.txt");
        File outFile = new File("C:/Users/sujal.000/Desktop/Java_Nptel/Program_89 Copy a File into another using CharacterStream/output.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try{
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);
            int ch;
            while((ch = ins.read()) != -1){
                outs.write(ch);
            }
        }  catch(Exception e){
            System.out.println(e);
            System.exit(-1);
        } finally{
            try{
                ins.close();
                outs.close();
            }
            catch(Exception e){}
        }
    }
}