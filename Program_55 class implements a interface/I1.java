interface I1 {
    public static int i = 555;
    void printInterface();
}
// The following code is invalid!
class I2 implements I1 {
    public static int h =111;
    public void printInterface(){
        System.out.println("Geek!");
    }
}