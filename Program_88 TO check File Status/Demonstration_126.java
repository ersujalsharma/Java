import java.io.*;

class Demonstration_126 {
    public static void getPaths(File f) throws IOException{
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());
    }
    public static void getInfo(File f) throws IOException{
        if(f.exists()){
            System.out.print("File Exists");
            System.out.println(f.canRead() ? "and is readable":"");
            System.out.println(f.canWrite() ? "and is Writable":"");
            System.out.println("File is last modified : "+f.lastModified());
            System.out.println("File is "+f.length()+"bytes");  
        }else
            System.out.println("File does not exist");
    }
    public static void main(String... args) throws IOException{
        File fileTocheck;
        if(args.length>0){
            for(int i = 0 ; i<args.length ; i++){
                fileTocheck = new File(args[i]);
                getPaths(fileTocheck);
                getInfo(fileTocheck);
            }
        }else
            System.out.println("Usage : Java file test <filename (s) >");
    }
}