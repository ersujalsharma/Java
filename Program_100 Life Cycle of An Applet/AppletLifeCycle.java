import java.applet.Applet;
import java.awt.Graphics;
public class AppletLifeCycle extends Applet{
	StringBuffer strBuffer;
	public void init(){
		strBuffer = new StringBuffer();
		addItem("Initializing the Applet");
	}
	public void start(){
		addItem("Starting the Applet");
	}
	public void stop(){
		addItem("Stopping the Applet");
	}
	public void destroy(){
		addItem("Unloading the Applet");
	}
	void addItem(String word){
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}
	public void paint(Graphics g){
		g.drawRect(0,0,getWidth() - 1,getHeight() - 1);
		g.drawString(strBuffer.toString(),10,20);
	}
}
//<applet code="AppletLifeCycle.class" width="300" height="300"></applet>