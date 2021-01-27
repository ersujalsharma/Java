public class Demonstration_103 {
    static int anyFunction(int x, int y){
        int a =x/y;
        return a;
    }
    public static void main(String... args){
        int a,b,result;
        a=0;
        b=0;
        System.out.println("Enter any two integers : ");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        result = anyFunction(a,b);
        System.out.println("Result : "+result);
    }
}
// run with
//java Demonstration_103 200 10
//java Demonstration_103 10 0