// Multi try Single Catch
class Demonstration_108{
    public static int j;
    public static void main(String... a){
        for(int i = 0 ; i<4 ; i++){
            try{
                switch(i){
                    case 0: 
                        int zero = 0;
                        j=999/zero; // Devide by Zero
                        break;
                    case 1:
                        int b[] = null;
                        j = b[0]; //Null Pointer
                        break;
                    case 2:
                        int c[] = new int [2];
                        j = c[10]; // Array OOB
                        break;
                    case 3:
                        char ch = "Java".charAt(9);// String index OutOfBoundsExceptionStub
                        break;
                }
            }
            catch(Exception e){
                System.out.println("In Test case#"+i+"\n");
                System.out.println(e.getMessage());
            }
        }
    }
}