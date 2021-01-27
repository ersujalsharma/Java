import java.awt.*;
import java.applet.*;
public class ParamBanner extends Applet implements Runnable{
	String msg = "A Simple Moving Banner.";
	Thread t = null;
	int state;
	boolean stopFlag;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start(){
		msg = getParameter("message");
		if(msg == null) msg = "Message NOt found.";
		msg = "" + msg;
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	public void run(){
		char ch;
		for(;;){
			try{
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1 , msg.length());
				msg += ch;
				if(stopFlag)
					break;
			}catch(InterruptedException e){}
		}
	}	
	public void stop(){
		stopFlag = true;
		t = null;
	}
	public void paint(Graphics g){
		g.drawString(msg,50,30);
	}
}
/*<applet code="ParamBanner.class" width="300" height="300">
<param name=message value="JAva makes the web move!  ">
</applet>
*/
