class Demonstration_1011b {
    public static void main(String... args){
        try{
            int a = args.length;
            int b = 42/a; // Devide by Zero
            System.out.println("a = "+ a);
            if(a==1)
            a = a/(a-1); //ANother Devide byzero
            try{
                if(a==2){
                int c[] = {1};
                c[2] = 99; //out of bound exception
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out-of-bound: " + e);
            }
        }catch(ArithmeticException e){
            System.out.println("Devide by 0:"+e);
         }
    }
}