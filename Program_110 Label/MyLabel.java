import java.awt.*;
public class MyLabel {
    public static void main(String... args){
        Frame f = new Frame("MyLabel");
        Label l1= new Label("First Name");
        l1.setBounds(50,100,100,30);
        Label l2= new Label("Last Name");
        l2.setBounds(50,150,100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}