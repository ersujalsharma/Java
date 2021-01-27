import java.io.*;
import java.net.*;
public class HttpURLConnectionClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://oceanofgame.org");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            for (int i = 0; i < 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderFieldKey(i));
            }
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}