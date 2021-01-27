import myPackage.*;
class Demonstration_810{
    public static void main(String... aads){
        Balance current[] = new Balance[3];
        current[0] = new Balance("Ranjeet",1022.123);
        current[1] = new Balance("Deepak",200.14);
        current[2] = new Balance("Sujal",100.324);
        for(int i=0;i<3;i++)
        {
            current[i].show();
        }    
    }
}