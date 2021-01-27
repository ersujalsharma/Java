class Demonstration_1011a {
    public static void main(String... args){
        int a = args.length;
        int b = 42/a; // Devide by Zero
        System.out.println("a = "+ a);
        if(a==1)
            a = a/(a-1); //ANother Devide byzero
        if(a==2){
            int c[] = {1};
            c[2] = 99; //out of bound exception
        }
    }
}