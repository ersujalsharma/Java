import java.applet.*;
import java.awt.*;
public class Methods extends Applet{
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "Inside init() --";
	}
	public void start(){
		msg+= "Inside Start() --";
	}
	public void paint(Graphics g){
		msg+= "Inside paint() --";
		g.drawString(msg,20,30);
	}
}
/*
<html>
<body>
<applet code="Methods.class" width="300" height="300">
</applet>
</body>
</html>
*/