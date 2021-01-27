import myPackage.Balance;
class Savings extends Balance{
    String branch;
    int customerID;
    Savings(String n, double bal, String br, int id){
        super(n, bal);
        branch =br;
        customerID = id;
    }
    public void show(){
       if (bal < 0){
            System.out.println("Sorry! Negative Balance");
        }
        System.out.println(name + ": $"+ bal +" Branch :"+branch+" customerID : "+customerID);
    }
}
class Demonstration_812{
    public static void main(String... aads){
        Savings current[] = new Savings[3];
        current[0] = new Savings("Ranjeet",1022.123,"Kolkata",123);
        current[1] = new Savings("Deepak",200.14,"Mumbai",432);
        current[2] = new Savings("Sujal",100.324,"Delhi",111);
        for(int i=0;i<3;i++)
        {
            current[i].show();
        }    
    }
}