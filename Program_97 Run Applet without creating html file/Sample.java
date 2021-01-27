import java.applet.*;
import java.awt.*;
public class Sample extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello World!",150,150);
	}
}
/*
<html>
	<body>
		<applet code="Sample.class" width="300" height="300">
		</applet>
	</body>
</html>
*/