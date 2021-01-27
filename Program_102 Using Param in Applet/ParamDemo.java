import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet{
    String fontName;
    int fontSize;
    float leading;
    boolean active;
    public void start(){
        String param;
        fontName = getParameter("fontName");
        if(fontName == null)
        fontName = "Not Found";
        param = getParameter("fontSize");
        try{
            if(param != null)
            fontSize = Integer.parseInt(param);
            else
            fontSize = 0;
        }catch(NumberFormatException e){
            fontSize = -1;
        }
        param = getParameter("leading");
        try{
            if(param != null)
            leading = Float.valueOf(param).floatValue();
            else
            leading = 0;
        }catch(NumberFormatException e){
            leading = -1;
        }
        param = getParameter("accountEnabled");
        if(param != null)
        active = Boolean.valueOf(param).booleanValue();
    }
    public void paint(Graphics g){
        g.drawString("FontName: "+ fontName , 11,12);
        g.drawString("FontSize: "+ fontSize , 15,20);
        g.drawString("Leading: "+ leading , 25,30);
        g.drawString("Account Active: "+ active , 35,40);
    }
}

