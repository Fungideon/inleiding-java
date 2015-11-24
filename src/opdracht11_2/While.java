package opdracht11_2;

import java.awt.*;
import java.applet.*;


public class While extends Applet {
	
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