import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletFrame" width="300" height="300"></applet>*/

class SampleFrame extends Frame {
	SampleFrame(String title){
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
	}
	public void paint(Graphics g){
		g.drawString("This is in frame window",10,40);
	}
}
class MyWindowAdapter extends WindowAdapter{
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame sampleFrame){
		this.sampleFrame = sampleFrame;
	}public void WindowClosing(WindowEvent we){
		sampleFrame.setVisible(false);
	}
}
public class AppletFrame extends Applet{
	Frame f;
	public void init(){
		f = new SampleFrame("A Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("This is Sujal Sharma" , 10 , 20);
	}	
}