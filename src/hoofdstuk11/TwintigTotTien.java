package hoofdstuk11;

import java.awt.*;
import java.applet.*;


public class TwintigTotTien extends Applet {
	
    public void init() {
    	setSize(300, 400);
    }
    

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;
		
        while(teller > 10) {
            y += 20;
            g.drawString("" + teller, 20 , y);
            teller -= 1;
        }
    }
}