import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Keycodes.java" width=400 height =500>
</applet>
*/
public class Keycodes extends Applet implements KeyListener{
    String msg = ""; int X=10,Y=20;
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    public void keyPressed(KeyEvent ke){
        showStatus("KeyDown");
        int key = ke.getKeyCode();
        switch(key){
            case KeyEvent.VK_F1 : msg += "<F1>";
                break;
            case KeyEvent.VK_F2 : msg += "<F2>";
                break;
            case KeyEvent.VK_F3 : msg += "<F2>";
                break;
            case KeyEvent.VK_PAGE_DOWN : msg += "Page Up";
                break;
            case KeyEvent.VK_PAGE_UP : msg += "Page Down";
                break;
            case KeyEvent.VK_LEFT : msg += "  <---  ";
                break;
            case KeyEvent.VK_RIGHT : msg += "  --->  ";
                break;
        }
        repaint();
    }
    public void keyReleased(KeyEvent ke){
        showStatus("KeyUp");
    }
    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg , X ,Y);
    }
}