import java.util.Scanner;
class Demonstration_45{
public static void main(String... args){
Scanner scnr = new Scanner(System.in);
System.out.println("Please Enter Two NO.s to find maximum of two");
int a=scnr.nextInt();
int b=scnr.nextInt();
if(a>b)
{
System.out.printf("Between %d and %d,maximum is %d \n", a, b, a);
}
else
{
System.out.printf("Between %d and %d,maximum is %d \n", a, b, b);
}
}
}