import java.awt.*;
public class MyPanel {
    public static void main(String... args){
    Frame frame = new Frame("Frame in Java With Panel");
    Panel panel = new Panel();
    frame.resize(200,200);
    frame.setBackground(Color.RED);
    frame.setLayout(null);
    panel.resize(100,100);
    panel.setBackground(Color.GREEN);
    frame.add(panel);
    frame.show();
    }    
}