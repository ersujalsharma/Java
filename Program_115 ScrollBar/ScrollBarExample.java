import java.awt.*;
public class ScrollBarExample {
    ScrollBarExample(){
        Frame f =new Frame("Scroll Bar");
        Scrollbar h = new Scrollbar(Scrollbar.HORIZONTAL,0,20,300,50);
        h.setBounds(100,50,300,50);
        Scrollbar v = new Scrollbar(Scrollbar.VERTICAL,0,20,300,50);
        v.setBounds(100,200,50,300);
        f.add(h);
        f.add(v);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String... args){
        new ScrollBarExample();
    }
}