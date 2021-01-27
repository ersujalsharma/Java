import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Keyevents extends Applet implements KeyListener{
    String msg = ""; int X = 10 , Y = 20;
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    public void keyPressed(KeyEvent ke){
        showStatus("KeyUp");
    }
    public void keyReleased(KeyEvent ke){
        showStatus("KeyDown");
    }
    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg ,X ,Y);
    }
}
/* 
<applet code="Keyevents.class" width=400 height=500>
</applet>
*/