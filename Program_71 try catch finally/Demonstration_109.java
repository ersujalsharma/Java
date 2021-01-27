class Demonstration_109 {
    public static void main(String... a){
        int i = 0;
        String greetings[] = {"Hello Twinkle !","Hello Java","Hello World"};
        while(i<4){
            try{
                System.out.println(greetings[1]);
                i++;
            }
            catch(Exception e){
                System.out.println(e.toString());
                //Message of exception in String Final
            }
            finally{
                System.out.println("Hi!");
                if(i<3);
                else{
                    System.out.println("You should quit and reset index value");
                    break;
                }
            }
        }
    }    
}