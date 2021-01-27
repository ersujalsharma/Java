import java.io.*;

class Demonstration_121{
    public static void main(String args[]){
        double principalAmount = 0.0;
        double rateOfInterest = 0.0;
        int numberOfYears = 0;
        try{
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.print("Enter Principal Amount: ");
            System.out.flush();
            tempString = in.readLine();
            principalAmount = Float.valueOf(tempString);
            System.out.print("Enter rate of interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);
            System.out.print("Enter Number of Years:");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
            double interestTotal = principalAmount*rateOfInterest*numberOfYears;
            System.out.println("Total Interest = "+interestTotal);
    }
}