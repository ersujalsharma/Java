import java.awt.*;
public class Calculator{
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,dec,eq;
    Calculator(){
        Frame f = new Frame("Calculator");
        Panel p = new Panel();
        f.setLayout(new FlowLayout());
        f.setBackground(Color.blue);
        TextField t = new TextField(10);
        f.add(t);
        f.add(p);
        p.setBackground(Color.blue);
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");    
        five = new Button("5");
        six = new Button("6");        
        seven = new Button("7");        
        eight = new Button("8");        
        nine = new Button("9");        
        zero = new Button("0");                
        dec = new Button(".");
        add = new Button("+");        
        sub = new Button("-");        
        mul = new Button("X");        
        div = new Button("/");
        eq = new Button("=");
        p.setLayout(new GridLayout(4,4,5,5));
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(div);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(mul);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(sub);
        p.add(zero);
        p.add(dec);
        p.add(add);
        p.add(eq);
        f.setSize(100,200);
        f.setVisible(true);
    }
    public static void main(String... args){
        new Calculator();
    }
}