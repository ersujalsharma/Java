import java.awt.*;
public class ButtonExample extends Component{
    public static void main(String... args){
        Frame frame = new Frame("Frame in Java With Button");
        Button b = new Button("Click Me");
        b.setBounds(150,50,180,130);
        frame.add(b);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}